package com.oao.oaoui.action;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Handles requests for the application home page.
 */
@Component
public class MainAction extends AbstractAction{
	//puede ser sin extends AbstractAction todavia no entiendo la diferencia ref: http://docs.spring.io/spring-webflow/docs/current-SNAPSHOT/reference/html/actions.html
	
	private static final Logger LOG = LoggerFactory.getLogger(MainAction.class);
	
	public void function(){
		LOG.info("entro al action");
	}
	

	
}
