package pe.egcc.eureka.service.spec;

import java.util.List;
import pe.egcc.eureka.model.Cliente;

/**
 *
 * @author Gustavo Coronel
 * @email gcoronelc@gmail.com
 * @blog www.desarrollasoftware.com
 */
public interface ClienteServiceSpec {
  
  
  Cliente getCliente(String codigo);
  
  List<Cliente> getClientes(Cliente bean);
  
}
