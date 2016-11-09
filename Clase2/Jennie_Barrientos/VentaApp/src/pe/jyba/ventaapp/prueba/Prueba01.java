/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.jyba.ventaapp.prueba;

import pe.jyba.ventaapp.model.VentaModel;
import pe.jyba.ventaapp.service.VentaService;

/**
 *
 * @author Alumno
 */
public class Prueba01 {
    
    public static void main(String[] args) {
        // Datos
        VentaModel model= new VentaModel(500, 10);
        //Proceso
        VentaService service=new VentaService();
        service.procesar(model);
        
        //Reporte
        System.out.println("Importe: " + model.getImporte());
        System.out.println("Impuesto: " + model.getImpuesto());
        System.out.println("Total: " + model.getTotal());
    }
    
    
}
