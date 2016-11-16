package model;

/**
 *
 * @author Gustavo Coronel
 * @email gcoronelc@gmail.com
 * @blog www.desarrollasoftware.com
 */
public class Venta {

  private String producto;
  private double precio;
  private int cant;
  private double importe;

  // Constructor por defecto
  public Venta() {
  }

  // Constructor adicional
  public Venta(String producto, double precio, int cant, double importe) {
    this.producto = producto;
    this.precio = precio;
    this.cant = cant;
    this.importe = importe;
  }

  // Otro constructor adicional
  public Venta(String producto, double precio, int cant) {
    this.producto = producto;
    this.precio = precio;
    this.cant = cant;
    this.importe = precio * cant;
  }

  // Otro constructor adicional
  public Venta(String producto, int cant, double precio) {
    this.producto = producto;
    this.precio = precio;
    this.cant = cant;
    this.importe = precio * cant;
  }

  public String getProducto() {
    return producto;
  }

  public void setProducto(String producto) {
    this.producto = producto;
  }

  public double getPrecio() {
    return precio;
  }

  public void setPrecio(double precio) {
    this.precio = precio;
  }

  public int getCant() {
    return cant;
  }

  public void setCant(int cant) {
    this.cant = cant;
  }

  public double getImporte() {
    return importe;
  }

  public void setImporte(double importe) {
    this.importe = importe;
  }

  @Override
  public String toString() {
    String texto = "";
    texto += this.producto + " | ";
    texto += this.precio + " | ";
    texto += this.cant + " | ";
    texto += this.importe;
    return texto;
  }

}
