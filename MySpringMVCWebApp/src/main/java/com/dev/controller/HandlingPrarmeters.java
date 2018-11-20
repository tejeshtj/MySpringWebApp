package com.dev.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dev.beans.Person;

@Controller
@RequestMapping("/param")
public class HandlingPrarmeters {
	
	@RequestMapping(value = "/form",method = RequestMethod.GET)
	public String getForm(){
		return "Form";
	}
	
	@RequestMapping(value="/query",method=RequestMethod.GET)//to handle the get requests
	public String getQueryString(
			@RequestParam("name") String name, // get the parameter value and automatically convert to strings
			@RequestParam("age") int age
			,Model m){
		m.addAttribute("name", name);
		m.addAttribute("age", age);
		System.out.println(name);
		System.out.println(age);
		
		return "Msg";
	}
	int i;
	@RequestMapping(value="/submit1",method=RequestMethod.POST)
	public String getFormData( Person p){
		
		System.out.println(p);
		//spring will automatically set them in request attribute
		return "Person";
	}
	
	
	@RequestMapping(value="/submit",method=RequestMethod.POST)
	public void getRequestBody(@RequestBody Person p){
		
		System.out.println(p);
		//spring will automatically set them in request attribute
		
	}
	
	@RequestMapping(value="/path/{name}/{age}")
	public String getPathVariable(
			@PathVariable("name") String name,
			@PathVariable("age") String age,Model m
			){
		//this one is used   to get params from path variable
		m.addAttribute("name", name);
		m.addAttribute("age", age);
		System.out.println(name);
		System.out.println(age);
		return "Msg";
	}
	
	
	
	
	
}