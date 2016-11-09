/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.jyba.ventaapp.service;

import pe.jyba.ventaapp.model.VentaModel;

/**
 *
 * @author Alumno
 */
public class VentaService {
    
      public void procesar(VentaModel model){
        //Variables
        double importe, impuesto, total;
        
        //Proceso
        total= model.getPrecio()* model.getCantidad();
        importe= total/1.18;
        impuesto= total - importe;
           
       //Respuesta
        model.setImporte(importe);
        model.setImpuesto(impuesto);
        model.setTotal(total);
             
    }    
}
