package pe.egcc.eurekaweb.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Gustavo Coronel
 * @email gcoronelc@gmail.com
 * @blog www.desarrollasoftware.com
 */
public final class Util {

  private Util() {
  }
  
  public static void forward(HttpServletRequest request, 
          HttpServletResponse response,
          String target) throws ServletException, IOException {
    RequestDispatcher rd;
    rd = request.getRequestDispatcher(target);
    rd.forward(request, response);
  }
}
