<%-- 
    Document   : index
    Created on : 03/07/2022, 15:17:08
    Author     : Douglas Ferreira
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    float resultado = 0;
    float campoa = 0;
    float campob = 0;
    
    if(request.getMethod() == "POST"){
        campoa = Float.parseFloat(request.getParameter("campoa"));
        campob = Float.parseFloat(request.getParameter("campob"));
        
        if(request.getParameter("somar") != null){
            resultado = campoa + campob;
        }
        
        if(request.getParameter("subtrair") != null){
            resultado = campoa - campob;
        }
    }
%>
    
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculadora</title>
    </head>
    <body>
        <h1>Atlantic Solutions</h1>
        <h2>Teste B</h2>
        <form method="post" >
            Campo A:</br>
            <input type="number" required name ="campoa" value="<%= campoa %>"/><br/>
            Campo B:</br>
            <input type="number" required name ="campob" value="<%= campob %>"/><br/><br/>
            <input type="submit" value="Somar" name="somar" />
            <input type="submit" value="Subtrair" name="subtrair" />
            <br/><br/>
            O Resultado é: <%= resultado%>
        </form>
    </body>
</html>
