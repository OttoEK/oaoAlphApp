package com.oao.oaoui;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.SessionScope;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(HttpServletRequest request) {
		invalidateSession(request);
		request.getSession().setAttribute("view", "home");
		return "landing-flow";
	}
	
	@RequestMapping(value = "/listar", method = RequestMethod.GET)
	public String listar(HttpServletRequest request) {
		invalidateSession(request);
		request.getSession().setAttribute("view", "listar");
		return "landing-flow";
	}
	
	@RequestMapping(value = "/agregar", method = RequestMethod.GET)
	public String agregar(HttpServletRequest request) {
		invalidateSession(request);
		request.getSession().setAttribute("view", "agregar");
		return "landing-flow";
	}
	
	public static void invalidateSession(HttpServletRequest request) {
		HttpSession httpSession = request.getSession();
		if (!httpSession.isNew()) {
			httpSession.invalidate();
			request.getSession(true);
		}
	}
	
}
