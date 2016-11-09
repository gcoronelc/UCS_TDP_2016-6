/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.rc.pagoapp.Service;

import pe.rc.pagoapp.model.PagoModel;

/**
 *
 * @author Alumno
 */
public class PagoService {
   //calcula los ingresos  
   public void procesar(PagoModel model){
       //variables
     int cantidad;
     double precio, impuesto, importe, total;
     
     cantidad=model.getCantidad();
     precio=model.getPrecio();
    
     total= cantidad *  precio;
     importe= total/1.18;
     impuesto = total - importe;
   
     model.setTotal(total);
     model.setImporte(importe);
     model.setImpuesto(impuesto);
     
   }
   
   
   
   
   
}
