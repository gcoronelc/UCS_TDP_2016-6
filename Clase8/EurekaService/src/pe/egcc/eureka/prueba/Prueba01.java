package pe.egcc.eureka.prueba;

import java.sql.Connection;
import pe.egcc.eureka.db.AccesoDB;

/**
 *
 * @author Gustavo Coronel
 * @email gcoronelc@gmail.com
 * @blog www.desarrollasoftware.com
 */
public class Prueba01 {
  
  public static void main(String[] args) {
    try {
      Connection cn = AccesoDB.getConnection();
      System.out.println("Conexión ok.");
      cn.close();
    } catch (Exception e) {
      System.err.println(e.getMessage());
    }
  }
}
