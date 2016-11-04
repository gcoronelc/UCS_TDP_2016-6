package pe.egcc.demo01.prueba;

import pe.egcc.demo01.service.MateService;

/**
 *
 * @author Gustavo Coronel
 * @email gcoronelc@gmail.com
 * @blog www.desarrollasoftware.com
 */
public class Prueba01 {
  
  public static void main(String[] args) {
    MateService mateService = new MateService();
    System.out.println("5 + 1: " + mateService.sumar(5, 1));
  }
}
