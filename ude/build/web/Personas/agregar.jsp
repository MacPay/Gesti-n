<%-- 
    Document   : agregar
    Created on : 19-abr-2022, 16:17:34
    Author     : Java
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agregar Persona</title>
    </head>
    <body>
        <h1>Nuevo Registro</h1>
        <br/>
        <form method="POST" action="Personascontroller?accion=insertar" autocomplete="off">
            <p>
                C.I:
                <input id="ci" name="ci" type="text" />
            </p>
            <p>
                Nombre:
                <input id="nombre" name="nombre" type="text" />
            </p>
            <p>
                Apelldio:
                <input id="apellido" name="apellido" type="text" />
            </p>
            
            <button id="guardar" name="guardar" type="submit">Guardar</button>
        </form> 
    </body>
</html>
