<%-- 
    Document   : index
    Created on : 29-nov-2016, 20:16:01
    Author     : Docente
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="menu/menu.css" rel="stylesheet" type="text/css"/>
    <title>EUREKA WEB</title>
  </head>
  <body>
    <h1>EUREKA WEB</h1>
    <jsp:include page="menu/menu.jsp" />
    <h2>CONSULTA DE CLIENTE</h2>
    
    <c:if test="${error != null}">
      <p style="color:red;">${error}</p>
    </c:if>
    
    <form method="post" action="ClienteGetCliente">
      <label>Código:</label>
      <input type="text" name="codigo"/>
      <input type="submit" value="Consultar"/>
    </form>
    
    <c:if test="${bean != null}">
      <h2>RESULTADO</h2>
      <p>Código: ${bean.codigo}</p>
      <p>Paterno: ${bean.paterno}</p>
      <p>Materno: ${bean.materno}</p>
      <p>Nombre: ${bean.nombre}</p>
    </c:if>
    
  </body>
</html>
