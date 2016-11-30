package pe.egcc.eureka.service.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import pe.egcc.eureka.db.AccesoDB;
import pe.egcc.eureka.model.Cliente;
import pe.egcc.eureka.service.spec.ClienteServiceSpec;

/**
 *
 * @author Gustavo Coronel
 * @email gcoronelc@gmail.com
 * @blog www.desarrollasoftware.com
 */
public class ClienteServiceImpl implements ClienteServiceSpec{

  @Override
  public Cliente getCliente(String codigo) {
    Cliente bean = null;
    Connection cn = null;
    try {
      cn = AccesoDB.getConnection();
      String sql = "select chr_cliecodigo, vch_cliepaterno,"
              + "vch_cliematerno, vch_clienombre,"
              + "chr_cliedni, vch_clieciudad, "
              + "vch_cliedireccion, vch_clietelefono,"
              + "vch_clieemail from cliente "
              + "where chr_cliecodigo = ?";
      PreparedStatement pstm = cn.prepareStatement(sql);
      pstm.setString(1, codigo);
      ResultSet rs = pstm.executeQuery();
      // Se espera una sola fila
      if(rs.next()){
        bean = new Cliente();
        bean.setCodigo(codigo);
        bean.setPaterno(rs.getString("vch_cliepaterno"));
        bean.setMaterno(rs.getString("vch_cliematerno"));
        bean.setNombre(rs.getString("vch_clienombre"));
        bean.setDni(rs.getString("chr_cliedni"));
        bean.setCiudad(rs.getString("vch_clieciudad"));
        bean.setDireccion(rs.getString("vch_cliedireccion"));
        bean.setTelefono(rs.getString("vch_clietelefono"));
        bean.setEmail(rs.getString("vch_clieemail"));
      }
      rs.close();
      pstm.close();
    } catch (Exception e) {
      throw new RuntimeException(e.getMessage());
    } finally{
      try {
        cn.close();
      } catch (Exception e) {
      }
    }
    return bean;
  }

  @Override
  public List<Cliente> getClientes(Cliente bean) {
    List<Cliente> lista = new ArrayList<>();
    Connection cn = null;
    try {
      cn = AccesoDB.getConnection();
      String sql = "select chr_cliecodigo, vch_cliepaterno,"
              + "vch_cliematerno, vch_clienombre,"
              + "chr_cliedni, vch_clieciudad, "
              + "vch_cliedireccion, vch_clietelefono,"
              + "vch_clieemail from cliente "
              + "where vch_cliepaterno like concat('%',?,'%') "
              + "and vch_cliematerno like concat('%',?,'%') "
              + "and vch_clienombre like concat('%',?,'%') ";
      PreparedStatement pstm = cn.prepareStatement(sql);
      pstm.setString(1, bean.getPaterno());
      pstm.setString(2, bean.getMaterno());
      pstm.setString(3, bean.getNombre());
      ResultSet rs = pstm.executeQuery();
      // Se espera una sola fila
      while(rs.next()){
        Cliente o = new Cliente();
        o.setCodigo(rs.getString("chr_cliecodigo"));
        o.setPaterno(rs.getString("vch_cliepaterno"));
        o.setMaterno(rs.getString("vch_cliematerno"));
        o.setNombre(rs.getString("vch_clienombre"));
        o.setDni(rs.getString("chr_cliedni"));
        o.setCiudad(rs.getString("vch_clieciudad"));
        o.setDireccion(rs.getString("vch_cliedireccion"));
        o.setTelefono(rs.getString("vch_clietelefono"));
        o.setEmail(rs.getString("vch_clieemail"));
        lista.add(o);
      }
      rs.close();
      pstm.close();
    } catch (Exception e) {
      throw new RuntimeException(e.getMessage());
    } finally{
      try {
        cn.close();
      } catch (Exception e) {
      }
    }
    return lista;
  }
  
}
