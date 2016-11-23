package pe.egcc.ventaapp.prueba;

import pe.egcc.ventaapp.model.Producto;
import pe.egcc.ventaapp.service.VentaService;

/**
 *
 * @author Docente
 */
public class Prueba01 {
  
  public static void main(String[] args) {
    VentaService service = new VentaService();
    for(Producto bean: service.getProductos()){
      System.out.println(bean.getNombre() + " | " + bean.getPrecio());
    }
  }
  
}
