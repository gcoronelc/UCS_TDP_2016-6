package pe.egcc.eureka.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import pe.egcc.eureka.db.AccesoDB;
import pe.egcc.eureka.service.spec.CuentaServiceSpec;

/**
 *
 * @author Gustavo Coronel
 * @email gcoronelc@gmail.com
 * @blog www.desarrollasoftware.com
 */
public class CuentaServiceImpl implements CuentaServiceSpec{

  @Override
  public int doDeposito(String cuenta, double importe, String codEmp) {
    int nroOpe = 0;
    Connection cn = null;
    try {
      // Paso 1: Inicio de Tx
      cn = AccesoDB.getConnection();
      cn.setAutoCommit(false);
      // Paso 2: Leer datos de cuenta
      String sql = "select dec_cuensaldo, int_cuencontmov "
              + "from cuenta "
              + "where chr_cuencodigo = ? "
              + "and vch_cuenestado = 'ACTIVO' "
              + "for update";
      PreparedStatement pstm = cn.prepareStatement(sql);
      pstm.setString(1, cuenta);
      ResultSet rs = pstm.executeQuery();
      if (!rs.next()) {
        throw new Exception("Cuenta es incorrecta");
      }
      double saldo = rs.getDouble("dec_cuensaldo");
      nroOpe = rs.getInt("int_cuencontmov") + 1;
      rs.close();
      pstm.close();
      // Paso 3: Actualizar cuenta
      saldo += importe;
      sql = "update cuenta "
              + "  set dec_cuensaldo = ?,"
              + "  int_cuencontmov = ? "
              + "  where chr_cuencodigo = ?";
      pstm = cn.prepareStatement(sql);
      pstm.setDouble(1, saldo);
      pstm.setInt(2, nroOpe);
      pstm.setString(3, cuenta);
      pstm.executeUpdate();
      pstm.close();
      // Paso 4: Registrar operación
      sql = "insert into movimiento(chr_cuencodigo,"
              + "int_movinumero, dtt_movifecha, "
              + "chr_emplcodigo, chr_tipocodigo, "
              + "dec_moviimporte)  "
              + "values(?,?,SYSDATE(),?,'003',?)";
      pstm = cn.prepareStatement(sql);
      pstm.setString(1, cuenta);
      pstm.setInt(2, nroOpe);
      pstm.setString(3, codEmp);
      pstm.setDouble(4, importe);
      pstm.executeUpdate();
      pstm.close();
      // Paso 5: Confirmar Tx
      cn.commit();
    } catch (Exception e) {
      // Cancela transacción
      try {
        cn.rollback();
      } catch (Exception e1) {
      }
      // Propaga el error
      throw new RuntimeException(e.getMessage());
    } finally {
      try {
        cn.close();
      } catch (Exception e) {
      }
    }
    return nroOpe;
  }
  
}
