<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ page import="java.util.*" %>

<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<tiles:insertAttribute name="header"/>   
   	
   	<%-- <form action="${flowExecutionUrl}&_eventId=continue" method="post" id="ejemplo">
		<label>primera vista</label>
		<input name="input1">
		<button type="submit">segunda vista</button>
	</form>

<tiles:insertAttribute name="footer"/>    --%>
<!-- div class="container"> -->

      <div class="starter-template">
        <h1>Bootstrap starter template</h1>
        <p class="lead">Use this document as a way to quickly start any new project.<br> All you get is this text and a mostly barebones HTML document.</p>
      </div>

    <!-- </div> -->

<script src="<%=request.getContextPath() %>/js/validation.js"></script>
    
