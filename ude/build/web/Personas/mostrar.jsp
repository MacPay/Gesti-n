<%-- 
    Document   : agregar
    Created on : 19-abr-2022, 16:17:34
    Author     : Java
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>

<html>
    <head>
        <style><%@include file="/Personas/tablestyle.css"%></style>
        <style><%@include file="/Personas/mostrarstyle.css"%></style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title></title>
    </head>
    <body>
        <div class="background">
            <a href="Personascontroller?accion=nuevo">Agregar</a>
            <div class="tablausuarios">
                <script src="https://use.fontawesome.com/bf66789927.js"></script>
                <h1>Usuarios</h1>

		<table class="listado">
			<thead>
				<tr>
					<th><h1>C.I</h1></th>
					<th><h1>Nombre</h1></th>
					<th><h1>Apellido</h1></th>
					<th colspan="2"><h1>Opciones</h1></th>
				</tr>
			</thead>
			<tbody>
                            <c:forEach var="i" items="${lista}">
                            <tr>
                                <td><c:out value="${i.ci}" /></td>
                                <td><c:out value="${i.nombre}" /></td>
                                <td><c:out value="${i.apellido}" /></td>    
                                <td class="icono"><a href="Personascontroller?accion=modificar&ci=<c:out value="${i.ci}"/>"><span class="fa fa-pencil-square-o fa-2x"></span></a></td>	
                                <td class="icono"><a href="Personascontroller?accion=eliminar&ci=<c:out value="${i.ci}"/>"><span class="fa fa-trash fa-2x"></span></a></td>
                            </tr>
			    </c:forEach>
			</tbody>
		</table>
                
            </div>
        </div>
        <h1></h1>
    </body>
</html>
