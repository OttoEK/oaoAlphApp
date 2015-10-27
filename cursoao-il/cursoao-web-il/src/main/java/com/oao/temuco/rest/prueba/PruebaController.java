package com.oao.temuco.rest.prueba;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PruebaController {
	
	@RequestMapping(value = "/hola/get", method = RequestMethod.POST)
	@ResponseBody
	public String get(@RequestBody final String value, final HttpServletRequest request) throws Exception {
	    return "Hola Mundo " + value;
	}
	
	
	

	
	

}
