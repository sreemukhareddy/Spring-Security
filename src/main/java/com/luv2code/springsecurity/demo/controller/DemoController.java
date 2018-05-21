package com.luv2code.springsecurity.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.luv2code.springsecurity.demo.entity.Customer;
import com.luv2code.springsecurity.demo.service.CustomerServiceImpl;



@Controller
public class DemoController {
	
	
	CustomerServiceImpl customerService=new CustomerServiceImpl();

	@GetMapping("/")
	public String showHome() {
		
		return "home";
	}
	
	

	@GetMapping("/leaders")
	public String showLeaders(Model theModel) {
		
		List<Customer> theCustomers = customerService.getCustomers();
		
		
		theModel.addAttribute("customers", theCustomers);
		
		return "totalAuthorityList";
	}
	
	
	
	@GetMapping("/someAuthority")
	public String showSystems() {
		
		return "someAuthority";
	}
	
}










