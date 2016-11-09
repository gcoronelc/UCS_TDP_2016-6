/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.kba.Prueba;

import pe.kba.Model.VentaModel;
import pe.kba.Service.VentaService;

/**
 *
 * @author Alumno
 */
public class Prueba01 {
    public static void main(String[] args) {
        VentaModel oPagoModel= new VentaModel(6, 20);
        VentaService oPagoService= new VentaService();
        oPagoService.procesar(oPagoModel);
        
        System.out.println("Importe: "+oPagoModel.getnImporte());
        System.out.println("Impuesto: "+oPagoModel.getnImpuesto());
        System.out.println("Total: "+oPagoModel.getnTotal());                
    }    
}
