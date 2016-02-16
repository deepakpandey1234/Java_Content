package com.demo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class SpringmvcController {

	@RequestMapping("/welcome")
	public ModelAndView welcome(){
		System.out.println("DEEPAK");
		ModelAndView modelAndView=new ModelAndView("hello");
		modelAndView.addObject("msg","Deepak");
		return modelAndView;
	}
}
