package prueba;

/**
 *
 * @author Gustavo Coronel
 * @email gcoronelc@gmail.com
 * @blog www.desarrollasoftware.com
 */
public class Prueba01 {
  
  public static void main(String[] args) {
    
    int[] notas = new int[5];
    
    mostrar(notas);
    
    notas[2] = 20;
    
    mostrar(notas);
    
  }

  private static void mostrar(int[] notas) {
    // Recorrido tipo indexado
    System.out.println("-------------------");
    for (int i = 0; i < notas.length; i++) {
      int nota = notas[i];
      System.out.println(i + ".- " + nota);
    }
    
  }
  
  
}
