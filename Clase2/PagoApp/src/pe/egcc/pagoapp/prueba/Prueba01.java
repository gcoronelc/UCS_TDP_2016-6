package pe.egcc.pagoapp.prueba;

import pe.egcc.pagoapp.model.PagoModel;
import pe.egcc.pagoapp.service.PagoService;

/**
 *
 * @author Gustavo Coronel
 * @email gcoronelc@gmail.com
 * @blog www.desarrollasoftware.com
 */
public class Prueba01 {
  
  public static void main(String[] args) {
    // Datos
    PagoModel model = new PagoModel(6, 20, 100.0);
    // Proceso
    PagoService service = new PagoService();
    service.procesar(model);
    // Reporte
    System.out.println("Ingresos: " + model.getIngresos());
    System.out.println("Renta: " + model.getRenta());
    System.out.println("Neto: " + model.getNeto());
  }
  
}
