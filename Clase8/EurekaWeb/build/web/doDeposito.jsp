<%-- 
    Document   : doDeposito
    Created on : 01-dic-2016, 21:47:21
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
    <h2>PROCESO DEPOSITO</h2>

    <c:if test="${repo != null}">
      <p style="color:blue;">${repo}</p>
    </c:if>
      
    <c:if test="${error != null}">
      <p style="color:red;">${error}</p>
    </c:if>

    <form method="post" action="CuentaPostDeposito">
      <table>
        <tr>
          <td>Cuenta:</td>
          <td><input type="text" name="cuenta"/></td>
        </tr>
        <tr>
          <td>Importe:</td>
          <td><input type="text" name="importe"/></td>
        </tr>
        <tr>
          <td colspan="2">
            <input type="submit" value="Procesar"/>
          </td>
        </tr>
      </table>
    </form>
  </body>
</html>
