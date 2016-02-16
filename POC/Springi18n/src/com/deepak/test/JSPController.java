package com.deepak.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class JSPController {
	@RequestMapping(value="/welcome", method=RequestMethod.GET)
	public ModelAndView hello(){
		ModelAndView model =new ModelAndView("Student");
		System.out.println("Deepak");
		return model;
	}
	
	

}
