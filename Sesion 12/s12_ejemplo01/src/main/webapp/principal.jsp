
<%@page import="com.certus.ejemplo.modelo.entidades.Administrador"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ingreso a la intranet</title>
    </head>
    <body>
        <%
            HttpSession sesion= request.getSession();
            Administrador ad= (Administrador)sesion.getAttribute("elAdministrador");
            System.out.println(ad.getApellido());
            if(ad!=null){
                
         %>
        
         <h1>Bienvenido <%= ad.getNombre() %>!</h1>
        
        <%
        }else{
        %>
                <h1>ERES un INTRUSO !</h1>

        <%}%>
    </body>
</html>
