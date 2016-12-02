package pe.egcc.eurekaweb.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pe.egcc.eureka.service.impl.CuentaServiceImpl;
import pe.egcc.eureka.service.spec.CuentaServiceSpec;

/**
 *
 * @author Gustavo Coronel
 * @email gcoronelc@gmail.com
 * @blog www.desarrollasoftware.com
 */
@WebServlet(name = "CuentaController",
        urlPatterns = {"/CuentaPostDeposito", "/Tttttt", "/Uuuuuu"})
public class CuentaController extends HttpServlet {

  @Override
  protected void service(HttpServletRequest request,
          HttpServletResponse response) throws ServletException, IOException {

    String path = request.getServletPath();
    if (path.equals("/CuentaPostDeposito")) {
      postDeposito(request,response);
    }
  }

  private void postDeposito(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    try {
     // Datos
     String cuenta = request.getParameter("cuenta");
     double importe = Double.parseDouble(request.getParameter("importe"));
     // Empleado
     String codEmp = "0003";
     // Proceso
      CuentaServiceSpec cuentaService;
      cuentaService = new CuentaServiceImpl();
      int nroOpe = cuentaService.doDeposito(cuenta, importe, codEmp);
      // Reporte
      request.setAttribute("repo", "Proceso ok. Operación " + nroOpe + ".");
    } catch (Exception e) {
      request.setAttribute("error", e.getMessage());
    }
    // Forward
    Util.forward(request, response, "doDeposito.jsp");
  } // postDeposito

} // Fin de CuentaController
