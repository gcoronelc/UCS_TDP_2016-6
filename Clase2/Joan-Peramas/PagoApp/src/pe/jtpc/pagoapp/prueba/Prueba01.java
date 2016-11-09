package pe.jtpc.pagoapp.prueba;

import pe.jtpc.pagoapp.model.PagoModel;
import pe.jtpc.pagoapp.service.PagoService;

/**
 *
 * @author Joan Peramas
 */
public class Prueba01 {
    
    public static void main(String[] args) {
        //Datos
        PagoModel model = new PagoModel(10, 5);
        // Proceso
        PagoService service = new PagoService();
        service.procesar(model);
        // Reporte
        System.out.println("Importe: " + model.getImporte());
        System.out.println("Impuesto: " + model.getImpuesto());
        System.out.println("Total: " + model.getTotal());
    }
    
}
