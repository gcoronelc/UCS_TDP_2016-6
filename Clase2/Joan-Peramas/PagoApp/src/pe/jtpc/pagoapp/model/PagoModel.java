package pe.jtpc.pagoapp.model;

/**
 *
 * @author Joan Peramas
 */
public class PagoModel {
    //Datos
    private double precio;
    private int cantidad;
    //Resultado
    private double importe;
    private double impuesto;
    private double total;

    /**
     * Contructor por defecto
    */
    public PagoModel() {
        
    }

    /**
     * 
     * @param precio double
     * @param cantidad double
     */
    public PagoModel(double precio, int cantidad) {
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public double getImpuesto() {
        return impuesto;
    }

    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
}
