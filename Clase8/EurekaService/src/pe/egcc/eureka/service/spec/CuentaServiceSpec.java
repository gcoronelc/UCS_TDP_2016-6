package pe.egcc.eureka.service.spec;

/**
 *
 * @author Gustavo Coronel
 * @email gcoronelc@gmail.com
 * @blog www.desarrollasoftware.com
 */
public interface CuentaServiceSpec {
  
  int doDeposito(String cuenta, double importe, String codEmp);
  
}
