package com.oao.temuco.rest;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;




@Controller
public class AplicacionController {
	
//@Autowired
//AplicacionService aplicacionService;

	
	@RequestMapping(value = "/chao/get", method = RequestMethod.POST,produces = "application/json")
	@ResponseBody
	public List<String> cget(@RequestBody final String value, final HttpServletRequest request) throws Exception {
		List<String> x = new ArrayList<String>();
		x.add("chao " + value);
		return x;
	}
	

}
