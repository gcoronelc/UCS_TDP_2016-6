package pe.egcc.ventaapp.service;

import java.util.ArrayList;
import java.util.List;
import pe.egcc.ventaapp.model.Producto;
import pe.egcc.ventaapp.model.Venta;

/**
 *
 * @author Gustavo Coronel
 * @email gcoronelc@gmail.com
 * @blog www.desarrollasoftware.com
 */
public class VentaService {

  public void procesar(Venta venta) {
    venta.setImporte(venta.getPrecio() * venta.getCant());
  }
  
  public List<Producto> getProductos(){
    List<Producto> lista = new ArrayList<>();
    lista.add(new Producto("Coca Cola",3.50));
    lista.add(new Producto("Choco Soda",1.50));
    lista.add(new Producto("Inka Cola",4.00));
    lista.add(new Producto("Galleta de Animalitos",2.80));
    lista.add(new Producto("Fanta Naranja",2.00));
    lista.add(new Producto("Chifles",2.80));
    return lista;
  }
  
  
}
