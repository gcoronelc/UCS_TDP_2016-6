package pe.jtpc.pagoapp.service;

import pe.jtpc.pagoapp.model.PagoModel;


/**
 *
 * @author Joan Peramas
 */
public class PagoService {
    /**
     * 
     * Calcula los ingresos , renta y neto
     * @param model Modelo de datos del pago al trabajador
     */
    public void procesar (PagoModel model){
        //Variables
        double impuesto, importe, total;
        //Proceso
        total = model.getPrecio() * model.getCantidad();
        importe = total / 1.18;
        impuesto = total - importe;
        
        //Respuesta
        model.setImporte(importe);
        model.setImpuesto(impuesto);
        model.setTotal(total);
    }
}
