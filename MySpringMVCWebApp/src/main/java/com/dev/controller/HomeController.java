package com.dev.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/controller")
public class HomeController {

	/*@Autowired
	JDBCImpl db;
	
	@Autowired
	GenerateCurrentDate date;*/
	
	/*@RequestMapping(value="/hello",method=RequestMethod.GET)
	public String hello() {
		return "Home";
	}*/
	
	@RequestMapping(value="/home", method=RequestMethod.GET)
     	public ModelAndView home(ModelAndView mv){					//model acts like a request object 
		mv.addObject("msg", "ICOMPASS is coming, work hard");
		mv.setViewName("Home");
		//	db.login();
		//System.out.println(date.getDate());
		return mv;
	}
	/*@RequestMapping(value="/home", method=RequestMethod.GET)
	public String home(Model m) {
		m.addAttribute("msg", "hi buggers...");
		return "Home";
	}*/

	
}
