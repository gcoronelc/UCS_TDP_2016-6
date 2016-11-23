package pe.egcc.prestamoapp;

import pe.egcc.prestamoapp.view.PrestamoView;

/**
 *
 * @author Gustavo Coronel
 * @email gcoronelc@gmail.com
 * @blog www.desarrollasoftware.com
 */
public class ClasePrincipal {
  
  private String nombre = "Gustavo";

  public ClasePrincipal( String nombre) {
    this.nombre = nombre;
  }
  
  public static void main(String[] args) {
    PrestamoView.main(args);
//    ClasePrincipal obj = new ClasePrincipal("Gustavo");
//    obj.mostrar();
//    
//    obj = new ClasePrincipal("Claudia");
//    obj.mostrar();
  }
  
  public void mostrar(){
    System.out.println(this.nombre);
  }
}
