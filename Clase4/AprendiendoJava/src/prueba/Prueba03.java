package prueba;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Gustavo Coronel
 * @email gcoronelc@gmail.com
 * @blog www.desarrollasoftware.com
 */
public class Prueba03 {
  
  public static void main(String[] args) {
    // Lista generica - de tipo Object
    List lista = new ArrayList();
    
    lista.add(123);
    lista.add(567.23);
    lista.add("Peru Gana a Brasil 4 - 0");
    lista.add(new Random());
    
    // Recorrido tipo colección o for each
    for (Object o : lista) {
      System.out.println(o);
    }
    
  }
}
