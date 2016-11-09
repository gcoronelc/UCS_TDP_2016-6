
package pe.kba.Model;

/**
 *
 * @author Alumno
 */
public class VentaModel {
    //Datos
    private double nPrecio;    
    private int nCantidad;
    
    //Resultado
    private double nImporte;
    private double nImpuesto;
    private double nTotal;

    
    /*Constructor*/
    public VentaModel() {
    }

    public VentaModel(double nPrecio, int nCantidad) {
        this.nPrecio = nPrecio;
        this.nCantidad = nCantidad;

    }

    public double getnPrecio() {
        return nPrecio;
    }

    public void setnPrecio(Double nPrecio) {
        this.nPrecio = nPrecio;
    }

    public int getnCantidad() {
        return nCantidad;
    }

    public void setnCantidad(int nCantidad) {
        this.nCantidad = nCantidad;
    }

    public double getnImporte() {
        return nImporte;
    }

    public void setnImporte(double nImporte) {
        this.nImporte = nImporte;
    }

    public double getnImpuesto() {
        return nImpuesto;
    }

    public void setnImpuesto(double nImpuesto) {
        this.nImpuesto = nImpuesto;
    }

    public double getnTotal() {
        return nTotal;
    }

    public void setnTotal(double nTotal) {
        this.nTotal = nTotal;
    }

 

}

