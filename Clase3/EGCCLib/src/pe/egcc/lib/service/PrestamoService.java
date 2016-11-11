package pe.egcc.lib.service;

import pe.egcc.lib.model.PrestamoModel;


/**
 *
 * @author Gustavo Coronel
 * @email gcoronelc@gmail.com
 * @blog www.desarrollasoftware.com
 */
public class PrestamoService {
  
  public void procesar(PrestamoModel model){
    double importe;
    importe = Math.pow((1 + model.getTasa()),model.getPeriodos());
    importe *= model.getCapital();
    model.setImporte(importe);
  }
}
