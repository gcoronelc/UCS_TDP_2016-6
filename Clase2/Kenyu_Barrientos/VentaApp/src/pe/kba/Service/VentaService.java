/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.kba.Service;

import pe.kba.Model.VentaModel;

/**
 *
 * @author Alumno
 */
public class VentaService {
 

    /**
     * Calcula los ingresos,renta y neto del pago al trabajador
     * @param oPagoModel 
     */
    public void procesar(VentaModel oPagoModel){
        
        double Importe,Impuesto, Total;
        Total = oPagoModel.getnCantidad()*oPagoModel.getnPrecio() ;
        Importe =Total/1.18;
        Impuesto = Total-Importe;
        
        oPagoModel.setnImporte(Importe);
        oPagoModel.setnImpuesto(Impuesto);
        oPagoModel.setnTotal(Total);
        
    }
}
