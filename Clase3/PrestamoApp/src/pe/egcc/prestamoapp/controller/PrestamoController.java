package pe.egcc.prestamoapp.controller;

import pe.egcc.lib.model.PrestamoModel;
import pe.egcc.lib.service.PrestamoService;


/**
 *
 * @author Docente
 */
public class PrestamoController {
  
  public void procesar(PrestamoModel model){
    PrestamoService service = new PrestamoService();
    service.procesar(model);
  }
}
