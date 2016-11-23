package pe.egcc.ventaapp.controller;

import java.util.List;
import pe.egcc.ventaapp.model.Producto;
import pe.egcc.ventaapp.model.Venta;
import pe.egcc.ventaapp.service.VentaService;

/**
 *
 * @author Gustavo Coronel
 * @email gcoronelc@gmail.com
 * @blog www.desarrollasoftware.com
 */
public class VentaController {

  

  private VentaService ventaService;

  public VentaController() {
    ventaService = new VentaService();
  }

  public List<Producto> getProductos(){
    return ventaService.getProductos();
  }
  
  public void procesar(Venta venta) {
    ventaService.procesar(venta);
  }
}
