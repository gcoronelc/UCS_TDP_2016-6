package pe.egcc.eurekaweb.controller;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import pe.egcc.eureka.model.Cliente;
import pe.egcc.eureka.service.impl.ClienteServiceImpl;
import pe.egcc.eureka.service.spec.ClienteServiceSpec;

/**
 *
 * @author Gustavo Coronel
 * @email gcoronelc@gmail.com
 * @blog www.desarrollasoftware.com
 */
@WebServlet(name = "ClienteController", 
        urlPatterns = {"/ClienteGetCliente", "/ClienteGetClientes", 
          "/dfdfdfd", "/dfdfd", "/dfdf"})
public class ClienteController extends HttpServlet {

  @Override
  protected void service(HttpServletRequest request, 
          HttpServletResponse response) throws ServletException, IOException {
    
    String path = request.getServletPath();
    
    if(path.equals("/ClienteGetCliente")){
      getCliente(request,response);
    } else if(path.equals("/ClienteGetClientes")){
      getClientes(request,response);
    }
    
  } // Fin de service

  private void getCliente(HttpServletRequest request, 
          HttpServletResponse response) 
          throws ServletException, IOException {
    try {
      // Dato
      String codigo = request.getParameter("codigo");
      // Proceso
      ClienteServiceSpec service;
      service = new ClienteServiceImpl();
      Cliente bean = service.getCliente(codigo);
      if(bean == null){
        throw new Exception("Código " + codigo + " no existe.");
      }
      request.setAttribute("bean", bean);
    } catch (Exception e) {
      request.setAttribute("error", e.getMessage());
    }
    // Forward
    Util.forward(request, response, "conCliente.jsp");
  } // getCliente

  private void getClientes(HttpServletRequest request, 
          HttpServletResponse response) throws ServletException, IOException {
    try {
      // Dato
      Cliente bean = new Cliente();
      bean.setPaterno(request.getParameter("paterno"));
      bean.setMaterno(request.getParameter("materno"));
      bean.setNombre(request.getParameter("nombre"));
      // Proceso
      ClienteServiceSpec service;
      service = new ClienteServiceImpl();
      List<Cliente> lista = service.getClientes(bean);
      if(lista.isEmpty()){
        throw new Exception("No se encontraron registros.");
      }
      request.setAttribute("bean", bean);
      request.setAttribute("lista", lista);
    } catch (Exception e) {
      request.setAttribute("error", e.getMessage());
    }
    // Forward
    Util.forward(request, response, "conClientes.jsp");
  } // getClientes

  
  
  
} // Fin del controlador
