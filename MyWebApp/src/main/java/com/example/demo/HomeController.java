package com.example.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
//	@RequestMapping("home")
////	@ResponseBody // display string response ie home.jsp to web page
//	public String home() {
//		
//		System.out.println("welcome to home text");
//		return "home";
//		
//	}
	
	// like servlets
//	@RequestMapping("home")
//	public String home(HttpServletRequest req) {
//		HttpSession session = req.getSession();
//		
//		String name = req.getParameter("name");
//		System.out.println(name);
//		session.setAttribute("name", name);
//		return "home";
//	}
	
	
	//with model and view
//	@RequestMapping("home")
//	public ModelAndView home(@RequestParam("name") String myName) {
//		ModelAndView mv = new ModelAndView();
//		
//		mv.addObject("name",myName);
////		mv.setViewName("home");
//		
//		return mv;
//	}
	
	@RequestMapping("home")
	public ModelAndView home(Alien alien) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("obj",alien);
		return mv;
	}
}
