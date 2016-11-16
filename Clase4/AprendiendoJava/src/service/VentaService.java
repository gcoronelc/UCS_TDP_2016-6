package service;

import java.util.ArrayList;
import java.util.List;
import model.Venta;

/**
 *
 * @author Gustavo Coronel
 * @email gcoronelc@gmail.com
 * @blog www.desarrollasoftware.com
 */
public class VentaService {
  
  
  public List<Venta> getVentas1(){
    List<Venta> lista = new ArrayList<>();
    lista.add(new Venta("Producto A", 60.0, 10));
    lista.add(new Venta("Producto B", 150.0, 50));
    lista.add(new Venta("Producto C", 85.0, 20));
    lista.add(new Venta("Producto D", 38.0, 12));
    lista.add(new Venta("Producto e", 76.0, 5));
    return lista;
  }
}
