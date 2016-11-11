package pe.egcc.lib.model;

/**
 *
 * @author Gustavo Coronel
 * @email gcoronelc@gmail.com
 * @blog www.desarrollasoftware.com
 */
public class PrestamoModel {

  // Datos
  private double capital;
  private double tasa;
  private int periodos;
  // Resultado
  private double importe;

  public PrestamoModel() {
  }

  public double getCapital() {
    return capital;
  }

  public void setCapital(double capital) {
    this.capital = capital;
  }

  public double getTasa() {
    return tasa;
  }

  public void setTasa(double tasa) {
    this.tasa = tasa;
  }

  public int getPeriodos() {
    return periodos;
  }

  public void setPeriodos(int periodos) {
    this.periodos = periodos;
  }

  public double getImporte() {
    return importe;
  }

  public void setImporte(double importe) {
    this.importe = importe;
  }

}
