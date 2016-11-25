package pe.egcc.eureka.service.impl;

import java.sql.Connection;
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
  
}
