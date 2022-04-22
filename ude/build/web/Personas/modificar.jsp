<%-- 
    Document   : modificar
    Created on : 19-abr-2022, 16:17:23
    Author     : Java
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Modificar</title>
    </head>
    <body>
        <h1>Modificar registro</h1>
        <br/>
        <form action="Personascontroller?accion=actualizar" method="POST" autocomplete="on">
            
            <p>
                C.I:
             <input id="ci" name="ci" type="text" value="<c:out value="${persona.ci}"/>"/>
            </p>
            <p>
                Nombre:
                <input id="nombre" name="nombre" type="text" value="<c:out value="${persona.nombre}"/>"/>
            </p>
            <p>
                Apelldio:
                <input id="apellido" name="apellido" type="text" value="<c:out value="${persona.apellido}"/>"/>
            </p>        
            <button id="guardar" name="guardar" type="submit">Guardar</button>
        </form> 
    </body>
</html>
