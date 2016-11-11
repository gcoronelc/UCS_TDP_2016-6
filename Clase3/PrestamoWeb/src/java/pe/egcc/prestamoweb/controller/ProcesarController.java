package pe.egcc.prestamoweb.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pe.egcc.lib.model.PrestamoModel;
import pe.egcc.lib.service.PrestamoService;

/**
 *
 * @author Gustavo Coronel
 * @email gcoronelc@gmail.com
 * @blog www.desarrollasoftware.com
 */
@WebServlet(name = "ProcesarController", urlPatterns = {"/ProcesarController"})
public class ProcesarController extends HttpServlet {

  @Override
  protected void service(HttpServletRequest request, 
          HttpServletResponse response) throws ServletException, IOException {
    try {
      // Datos
      PrestamoModel model = new PrestamoModel();
      model.setCapital(Double.parseDouble(request.getParameter("capital")));
      model.setTasa(Double.parseDouble(request.getParameter("tasa")));
      model.setPeriodos(Integer.parseInt(request.getParameter("meses")));
      // Proceso
      PrestamoService service = new PrestamoService();
      service.procesar(model);
      // Reporte
      request.setAttribute("model", model);
    } catch (Exception e) {
      request.setAttribute("error", e.getMessage());
    }
    // Forward
    RequestDispatcher rd;
    rd = request.getRequestDispatcher("index.jsp");
    rd.forward(request, response);
  }

  
}
