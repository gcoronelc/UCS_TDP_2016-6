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
    <h2>CONSULTA DE CLIENTES</h2>

    <c:if test="${error != null}">
      <p style="color:red;">${error}</p>
    </c:if>

    <form method="post" action="ClienteGetClientes">
      <table>
        <tr>
          <td>
            <label>Paterno</label><br/>
            <input type="text" name="paterno" value="${bean.paterno}"/>
          </td>
          <td>
            <label>Materno</label><br/>
            <input type="text" name="materno" value="${bean.materno}"/>
          </td>
          <td>
            <label>Nombre</label><br/>
            <input type="text" name="nombre" value="${bean.nombre}"/>
          </td>
          <td>
            <br/>
            <input type="submit" value="Consultar" />
          </td>
        </tr>
      </table>
    </form>

    <c:if test="${ ! empty lista}">
      <h2>RESULTADO</h2>
      <table border="1">
        <thead>
          <tr>
            <th>CODIGO</th>
            <th>PATERNO</th>
            <th>MATERNO</th>
            <th>NOMBRE</th>
            <th>DIRECCION</th>
          </tr>
        </thead>
        <tbody>
          <c:forEach items="${lista}" var="r">
          <tr>
            <td>${r.codigo}</td>
            <td>${r.paterno}</td>
            <td>${r.materno}</td>
            <td>${r.nombre}</td>
            <td>${r.direccion}</td>
          </tr>
          </c:forEach>
        </tbody>
      </table>
    </c:if>

  </body>
</html>
