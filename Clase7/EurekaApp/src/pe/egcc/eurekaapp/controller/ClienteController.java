package pe.egcc.eurekaapp.controller;

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
public class ClienteController {
  
  private ClienteServiceSpec clienteService;

  public ClienteController() {
    clienteService = new ClienteServiceImpl();
  }
  
  public Cliente getCliente(String codigo) {
    return clienteService.getCliente(codigo);
  }
  
  public List<Cliente> getClientes(Cliente bean) {
    return clienteService.getClientes(bean);
  }
  
  
  
}
