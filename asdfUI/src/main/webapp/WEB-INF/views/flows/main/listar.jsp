<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ page import="java.util.*"%>

<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<tiles:insertAttribute name="header" />


<div class="panel panel-default">
	<!-- Default panel contents -->
	<div class="panel-heading">Lista de aplicaciones</div>
	<div class="panel-body">
		<p>...</p>
	</div>
	<!-- Table -->
	<table class="table">
		<thead>
			<tr>
				<th>Aplicacion</th>
				<th>Ventana</th>
				<th>Activo</th>
				<th>Accion</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="aplicacionvar" items="${aplicaciones.aplicaciones}">
				<tr>
					<th scope="row">${aplicacionvar.sNombreAplicacion}</th>
					<td>${aplicacionvar.sTituloVentana}</td>
					<td>${aplicacionvar.bActivo}</td>
					<td>
						<button data-oao-action="submit" class="btn btn-default" href="${flowExecutionUrl}&_eventId=borrar&naplicacion=${aplicacionvar.nIdAplicacion}">Borrar</button>
						<button data-oao-action="submit" class="btn btn-primary" href="${flowExecutionUrl}&_eventId=actualizar&naplicacion=${aplicacionvar.nIdAplicacion}">Actualizar</button>					
					</td>
				</tr>
			</c:forEach>
		
			
		</tbody>
	</table>
	<table class="table">
		
	</table>
</div>

<script src="<%=request.getContextPath()%>/js/validation.js"></script>

