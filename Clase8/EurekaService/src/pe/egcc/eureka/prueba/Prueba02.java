package pe.egcc.eureka.prueba;

import pe.egcc.eureka.model.Cliente;
import pe.egcc.eureka.service.impl.ClienteServiceImpl;
import pe.egcc.eureka.service.spec.ClienteServiceSpec;

/**
 *
 * @author Gustavo Coronel
 * @email gcoronelc@gmail.com
 * @blog www.desarrollasoftware.com
 */
public class Prueba02 {
  
  public static void main(String[] args) {
    try {
      // Datos
      String codigo = "00002";
      // Proceso
      ClienteServiceSpec clienteService;
      clienteService = new ClienteServiceImpl();
      Cliente bean = clienteService.getCliente(codigo);
      if(bean == null){
        throw new Exception("Código no existe.");
      }
      // Reporte
      System.out.println("Código: " + bean.getCodigo());
      System.out.println("Paterno: " + bean.getPaterno());
      System.out.println("Materno: " + bean.getMaterno());
      System.out.println("Nombre: " + bean.getNombre());
    } catch (Exception e) {
      System.err.println("Error: " + e.getMessage());
    }
  }
}
