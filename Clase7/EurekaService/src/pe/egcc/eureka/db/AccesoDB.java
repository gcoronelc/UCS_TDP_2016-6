package pe.egcc.eureka.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Gustavo Coronel
 * @email gcoronelc@gmail.com
 * @blog www.desarrollasoftware.com
 */
public final class AccesoDB {

  private AccesoDB() {
  }
  
  
  public static Connection getConnection() throws SQLException{
    // Parametros de conexión
    String driver = "com.mysql.jdbc.Driver";
    String urlDB = "jdbc:mysql://172.33.2.107:3306/eurekabank";
    String user = "eureka";
    String pass = "admin";
    // El objeto Connection
    Connection cn = null;
    try {
      // Cargar el driver
      Class.forName(driver).newInstance();
      // Obtener el objeto Connection
      cn = DriverManager.getConnection(urlDB, user, pass);
    } catch (ClassNotFoundException e) {
      throw new SQLException("Falta el driver JDBC.");
    } catch(Exception e){
      throw new SQLException("No es posible la conexión con la BD.");
    }
    return cn;
  }
  
  
  
}
