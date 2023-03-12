package com.cropbazaar.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
@RequestMapping("/web")
public class WebController {


	@RequestMapping(value = "/login")
	   public ModelAndView login() {
		ModelAndView mvAndView=new ModelAndView();
		mvAndView.setViewName("login");
		return mvAndView ;
	   
	   }
	@RequestMapping(value = "/hello")
	   public ModelAndView hello() {
		ModelAndView mvAndView=new ModelAndView();
		mvAndView.setViewName("hello");
		return mvAndView ;
	   
	   }
}
