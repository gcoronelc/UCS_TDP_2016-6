package pe.egcc.pagoapp.service;

import pe.egcc.pagoapp.model.PagoModel;

/**
 *
 * @author Gustavo Coronel
 * @email gcoronelc@gmail.com
 * @blog www.desarrollasoftware.com
 */
public class PagoService {
  
  /**
   * Calcula los ingresos, renta y neto del pago al trabajador.
   * 
   * @param model Modelo de datos del pago al trabajador.
   */
  public void procesar(PagoModel model){
    // Variables
    double ingresos, renta, neto;
    // Proceso
    ingresos = model.getHorasDia() 
            * model.getDias() * model.getPagoHora();
    if(ingresos > 1500.0){
      renta = ingresos * 0.08;
    } else {
      renta = 0.0;
    }
    neto = ingresos - renta;
    // Respuesta
    model.setIngresos(ingresos);
    model.setRenta(renta);
    model.setNeto(neto);
  }
  
  
}
