package com.redisdemo.controllers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.redisdemo.domain.Blog;

@Controller
public class HomeController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home() {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("blogs", Arrays.asList(new Blog("Getting Started with OpenShift", "Getting Started with OpenShift"),new Blog("Getting Started with MongoDB", "Getting Started with MongoDB")));
		ModelAndView modelAndView = new ModelAndView("home", model);
		return modelAndView;
	}
}
