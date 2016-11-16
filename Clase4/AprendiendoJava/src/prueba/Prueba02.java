package prueba;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Gustavo Coronel
 * @email gcoronelc@gmail.com
 * @blog www.desarrollasoftware.com
 */
public class Prueba02 {
  
  public static void main(String[] args) {
    
    List<Integer> lista = new ArrayList<>();
    
    System.out.println("Tamaño: " + lista.size());
    
    lista.add(45);
    lista.add(65);
    lista.add(12);
    lista.add(78);
    lista.add(52);
    lista.add(60);
    
    System.out.println("Tamaño: " + lista.size());
    
    mostrar(lista);
    
    lista.remove(2);
    
    mostrar(lista);
    
    lista.add(2, 1000);
    
    mostrar(lista);
    
  }

  private static void mostrar(List<Integer> lista) {
    // Recorrido indexado
    System.out.println("------------------------");
    for (int i = 0; i < lista.size(); i++) {
      int value = lista.get(i);
      System.out.println(i + ".- " + value);
    }
  
  }
  
}
