package com.deepak.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.deepak.model.Contact;
import com.deepak.model.Person;

@Controller
public class HelloWorldController {

	@RequestMapping(value="/welcome", 
			method=RequestMethod.GET,produces={MediaType.APPLICATION_JSON_VALUE,  
                    MediaType.APPLICATION_XML_VALUE})
	public @ResponseBody Person hello() {

		  Person person = new Person();
		  ArrayList a=new ArrayList();
		  a.add("yo");
		   a.add("ko");
		   a.add("jo");
		   a.add("so");
		   a.add("to");
		   person.setEmpName(a);
		   person.setNumber("100");
	        return person;

	}
    @RequestMapping(value = "/addContact", method = RequestMethod.GET)
    public @ResponseBody Contact addContact(@ModelAttribute("contact")
                            Contact contact, BindingResult result) {
         
        System.out.println("First Name:" + contact.getFirstname() + 
                    "Last Name:" + contact.getLastname());
        System.out.println("ADD CONTACT");
         
        return contact;
    }
     
   
}
 
	
