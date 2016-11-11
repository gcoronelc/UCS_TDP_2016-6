<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>PRESTAMO</title>
    <style>
      label{
        width: 70px;
        display: inline-block;
      }
    </style>
  </head>
  <body>
    <h1>PRESTAMO</h1>
    
    <c:if test="${not empty error}">
      <p style="color:red;">${requestScope.error}</p>
    </c:if>
    
    <form method="post" action="ProcesarController">
      <div>
        <label>Capital:</label>
        <input type="text" name="capital" />
      </div>
      <div>
        <label>Tasa:</label>
        <input type="text" name="tasa" />
      </div>
      <div>
        <label>Meses:</label>
        <input type="text" name="meses" />
      </div>
      <div>
        <input type="submit" value="Procesar" />
      </div>
    </form>

    <!-- -->
    <c:if test="${not empty requestScope.model}">
      <p>Capital: ${requestScope.model.capital}</p>
      <p>Tasa: ${requestScope.model.tasa}</p>
      <p>Meses: ${requestScope.model.periodos}</p>
      <p>Importe: ${requestScope.model.importe}</p>
    </c:if>
  </body>
</html>
