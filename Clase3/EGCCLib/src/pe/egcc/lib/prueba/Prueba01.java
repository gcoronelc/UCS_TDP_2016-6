package pe.egcc.lib.prueba;

import pe.egcc.lib.model.PrestamoModel;
import pe.egcc.lib.service.PrestamoService;

/**
 *
 * @author Gustavo Coronel
 * @email gcoronelc@gmail.com
 * @blog www.desarrollasoftware.com
 */
public class Prueba01 {
  
  public static void main(String[] args) {
    // Dato
    PrestamoModel model = new PrestamoModel();
    model.setCapital(1000);
    model.setTasa(0.03);
    model.setPeriodos(12);
    // Proceso
    PrestamoService service = new PrestamoService();
    service.procesar(model);
    // Reporte
    System.out.println("Importe: " + model.getImporte());
  }
  
}
