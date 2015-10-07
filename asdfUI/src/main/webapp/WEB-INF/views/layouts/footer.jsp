<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>

<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>


<footer class="bbva-footer">
	<ul class="bbva-footer-link-list">
		
		<li class="bbva-footer-link-list-item"><a href="https://www.bbvacompass.com/security/ " target="_blank">Security Center</a></li>
		
		<li class="bbva-footer-link-list-item"><a href="https://www.bbvacompass.com/compass/policy/privacy.jsp"  target="_blank">Privacy</a></li>
		
		<li class="bbva-footer-link-list-item"><a href="http://www.bbvacompass.com/locations/"  target="_blank">Locations</a></li>
		
		<li class="bbva-footer-link-list-item"><a href="http://www.bbvacompass.com/contact/"  target="_blank">Contact Us</a></li>
	</ul>
    <ul class="bbva-application-disclaimer-list">
    	<li class="bbva-application-disclaimer-list-item">&#169;2015 BBVA Compass Bancshares, Inc. Compass Bank is a Member FDIC. BBVA Compass is a trade name of Compass Bank, a member of the BBVA Group. All accounts are subject to approval, which may include credit approval.
    	<c:if test= "${applicationAbstractCmd.primaryProductInfoCmd.isNBA}">The NBA identifications are the intellectual property
			 of NBA Properties, Inc. and the respective NBA member teams. ©2015 
			 NBA Properties, Inc. All Rights Reserved. 
		</c:if>	
    	</li>
    </ul>
</footer>