package com.dailycode.employee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dailycode.employee.entity.Employee;
import com.dailycode.employee.services.EmployeeService;

@Controller
@RequestMapping("/")
public class EmployeeController {

	@Autowired
	EmployeeService empService;
	
	
	@RequestMapping(value="/addEmployee")
	public ModelAndView addEmployee(Employee emp) {
		ModelAndView mv = new ModelAndView();
		
		Employee emp1=empService.addEmployee(emp);
		
		mv.setViewName("home.jsp");
		
		return mv;
	}
	
	@RequestMapping(value="/home",method = RequestMethod.GET)
	public String home() {
		
		return "home.jsp";
	}
}
