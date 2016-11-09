/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.rc.pagoapp.model;

/**
 *
 * @author Alumno
 */
public class PagoModel {
    
    //private int horasDias;
    private int cantidad;
    private double precio;
    
    private double importe;
    private double impuesto;
    private double total;
    

   
    //constructor por defecto
    public PagoModel() {
                
    }
    
    /**constructor adicional
     * 
     * @param cantidad horas por dia trabajadas
     * @param precio dias trabajados
     */
    
    
    public PagoModel(int cantidad, double precio) {
        this.cantidad= cantidad;
        this.precio= precio;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @return the importe
     */
    public double getImporte() {
        return importe;
    }

    /**
     * @param importe the importe to set
     */
    public void setImporte(double importe) {
        this.importe = importe;
    }

    /**
     * @return the impuesto
     */
    public double getImpuesto() {
        return impuesto;
    }

    /**
     * @param impuesto the impuesto to set
     */
    public void setImpuesto(double impuesto) {
        this.impuesto = impuesto;
    }

    /**
     * @return the total
     */
    public double getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(double total) {
        this.total = total;
    }
 


    
    
    
    
    
}
