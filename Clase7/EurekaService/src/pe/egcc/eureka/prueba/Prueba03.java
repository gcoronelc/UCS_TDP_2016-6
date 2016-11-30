package pe.egcc.eureka.prueba;

import java.util.List;
import pe.egcc.eureka.model.Cliente;
import pe.egcc.eureka.service.impl.ClienteServiceImpl;
import pe.egcc.eureka.service.spec.ClienteServiceSpec;

/**
 *
 * @author Gustavo Coronel
 * @email gcoronelc@gmail.com
 * @blog www.desarrollasoftware.com
 */
public class Prueba03 {
  
  public static void main(String[] args) {
    try {
      // Datos
      Cliente bean = new Cliente();
      bean.setPaterno("A");
      bean.setMaterno("V");
      bean.setNombre("");
      // Proceso
      ClienteServiceSpec clienteService;
      clienteService = new ClienteServiceImpl();
      List<Cliente> lista = clienteService.getClientes(bean);
      // Reporte
      for (Cliente o : lista) {
        System.out.println(o.getCodigo() + " | " 
          + o.getPaterno() + " | " + o.getMaterno() 
          + " | " + o.getNombre());
      }
    } catch (Exception e) {
      System.err.println("Error: " + e.getMessage());
    }
  }
}
