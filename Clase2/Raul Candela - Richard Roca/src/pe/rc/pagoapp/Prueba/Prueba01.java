/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.rc.pagoapp.Prueba;

import pe.rc.pagoapp.Service.PagoService;
import pe.rc.pagoapp.model.PagoModel;


/**
 *
 * @author Alumno
 */
public class Prueba01 {
    public static void main(String[] args) {
        
        //datos
    PagoModel modelo= new PagoModel(10,10);
//proceso
   PagoService service = new PagoService();
   service.procesar(modelo);
   
        System.out.println("Importe: " + modelo.getImporte());
        System.out.println("Impuesto: " + modelo.getImpuesto());        
        System.out.println("Total: " + modelo.getTotal());
        
    }

   
}
