package pe.egcc.eureka.prueba;

import java.util.List;
import pe.egcc.eureka.model.Cliente;
import pe.egcc.eureka.service.impl.ClienteServiceImpl;
import pe.egcc.eureka.service.impl.CuentaServiceImpl;
import pe.egcc.eureka.service.spec.ClienteServiceSpec;
import pe.egcc.eureka.service.spec.CuentaServiceSpec;

/**
 *
 * @author Gustavo Coronel
 * @email gcoronelc@gmail.com
 * @blog www.desarrollasoftware.com
 */
public class Prueba04 {
  
  public static void main(String[] args) {
    try {
      // Datos
      String cuenta = "00100001";
      double importe = 400.0;
      String codEmp = "0002";
      int nroOpe;
      // Proceso
      CuentaServiceSpec cuentaService;
      cuentaService = new CuentaServiceImpl();
      nroOpe = cuentaService.doDeposito(cuenta, importe, codEmp);
      // Reporte
      System.out.println("Nro. Operación: " + nroOpe);
    } catch (Exception e) {
      System.err.println("Error: " + e.getMessage());
    }
  }
}
