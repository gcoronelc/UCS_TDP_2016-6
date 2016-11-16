package prueba;

import model.Venta;
import service.VentaService;

/**
 *
 * @author Gustavo Coronel
 * @email gcoronelc@gmail.com
 * @blog www.desarrollasoftware.com
 */
public class Prueba05 {
  
  public static void main(String[] args) {
    VentaService ventaService;
    ventaService = new VentaService();
    
    for(Venta v: ventaService.getVentas1()){
      System.out.println(v.toString());
    }
  }
  
}
