package com.springdemo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springdemo.service.AddService;

@Controller
public class LoginController {
	@RequestMapping("/login")
	public ModelAndView login(HttpServletRequest request, HttpServletResponse res) {
		System.out.println("first code");
		
		System.out.println("This is a test");
		
		
		AddService service = new AddService();
		int k = service.add(Integer.parseInt(request.getParameter("text1")),Integer.parseInt(request.getParameter("text2")));
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("display");
		mv.addObject("result",k);
		return mv;
	}

}
