package com.demo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Login{
	
	
	@RequestMapping("/add")
	public ModelAndView add(HttpServletRequest request, HttpServletResponse response) {
		
		String result="";
		
		if(request.getParameter("t1" ).equals(request.getParameter("t2")))
		{
		result+="Succesful";	
		}
		else {
			result+="unsuccesful";
		}
		
		ModelAndView mv= new ModelAndView();  //create the object
		
		mv.setViewName("display.jsp");
		mv.addObject("result",result);
		
		return mv;
		
		
	}

}
