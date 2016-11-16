package prueba;

import model.Venta;

/**
 *
 * @author Gustavo Coronel
 * @email gcoronelc@gmail.com
 * @blog www.desarrollasoftware.com
 */
public class Prueba04 {
  
  public static void main(String[] args) {
    
    Venta v1 = new Venta();
    v1.setProducto("Chicharon");
    v1.setPrecio(30.0);
    v1.setCant(5);
    v1.setImporte(150.0);
    mostrar(v1);
    
    Venta v2 = new Venta("Coca Cola", 2.50, 20);
    mostrar(v2);
    
    
  }

  private static void mostrar(Venta v) {
    System.out.println("-----------------");
    System.out.println("Producto: " + v.getProducto());
    System.out.println("Precio: " + v.getPrecio());
    System.out.println("Cantidad: " + v.getCant());
    System.out.println("Importe: " + v.getImporte());
  
  }
}
