package com.celfy.backend.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public final class WebApplicationController {
	private static final Logger LOGGER = LoggerFactory.getLogger(WebApplicationController.class); 
	
	@RequestMapping("/")
	public ModelAndView index() {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("time", new Date());
		model.put("message", "Hello Sender!");
		
		LOGGER.info("Saying Hello to Sender");
		return new ModelAndView("index", model);
	}
	
	@RequestMapping("/secure")
	public ModelAndView dashboard() {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("time", new Date());
		model.put("message", "Hello Authenticated Sender!");
		
		return new ModelAndView("index", model);
	}
}
