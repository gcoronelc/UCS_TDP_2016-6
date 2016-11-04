package pe.egcc.demo01.service;

/**
 *
 * @author Gustavo Coronel
 * @email gcoronelc@gmail.com
 * @blog www.desarrollasoftware.com
 */
public class MateService {

  /**
   * Este método permie encontrar la suma de dos números.
   * @param n1 Primer parámetro
   * @param n2 Segundo parámetro
   * @return Retorna la suma de n1 y n2
   */
  public int sumar(int n1, int n2) {
    return (n1 + n2);
  }

  public int restar(int n1, int n2) {
    return (n1 - n2);
  }

  public int multiplicar(int n1, int n2) {
    return (n1 * n2);
  }

  public int dividir(int n1, int n2) {
    return (n1 / n2);
  }

  public int resto(int n1, int n2) {
    return (n1 % n2);
  }

}
