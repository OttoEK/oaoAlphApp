<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ page import="java.util.*"%>

<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
  
  

	<form:form class="form-horizontal" role="form" modelAttribute="aplicacion" action="${flowExecutionUrl}&_eventId=agregar" method="post" id="agregarForm" >
	
<div class="form-group">
    <label class="control-label col-sm-2" for="sNombreAplicacion">Nombre de la Aplicacion:</label>
    <div class="col-sm-10">
    
	<form:input path="sNombreAplicacion" type="text" class="form-control" id="sNombreAplicacion" placeholder="Nombre de la Aplicacion" maxlength="16" autocomplete="off"/>

<!-- 	<input name="sNombreAplicacion" type="text" class="form-control" id="sNombreAplicacion" placeholder="Nombre de la Aplicacion" maxlength="16" autocomplete="off"/>
 -->		
	</div>
</div>
 <div class="form-group">
    <label class="control-label col-sm-2" for="sTituloVentana">Titulo Ventana:</label>
        <div class="col-sm-10">
 
	 <form:input path="sTituloVentana" type="text" class="form-control" id="sTituloVentana" placeholder="Titulo Ventana" maxlength="16" autocomplete="off"/>

 	<!-- <input name="sTituloVentana" type="text" class="form-control" id="sTituloVentana" placeholder="Titulo Ventana" maxlength="16" autocomplete="off"/> -->
 	</div>
 </div>
  <div class="form-group">
    <label class="control-label col-sm-2" for="sUrlInicio">Url Inicio:</label>
        <div class="col-sm-10">
    
	<form:input path="sUrlInicio" type="text" class="form-control" id="sUrlInicio" placeholder="Url Inicio" maxlength="16" autocomplete="off"/>
<!--  		<input name="sUrlInicio" type="text" class="form-control" id="sUrlInicio" placeholder="Url Inicio" maxlength="16" autocomplete="off"/>
 --> 	   
 	  </div>
 	
 </div>
  <%-- <div class="checkbox">
    <label>
	<form:checkbox path="activo" />
<!--  		<input type="checkbox" name="bActivo" /> 	
 --> 		Activo
    </label> --%>
  </div>
  <button type="submit" class="btn btn-default">Registrar</button>
  </form:form>
