package com.ashok.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class BankRestController {

	@GetMapping("/welcome")
	public String welcome()
	{
		
		return "welcome to Gunji Bank...";
	}
	
	@GetMapping("/transfer")
	public String transfer()
	{
		
		return "you are eligible to transfer Amount";
	}
	
	@GetMapping("/balance")
	public String balance()
	{
		
		return "You Account Balance is Rs:10,000/-";
	}
	
	@GetMapping("/about")
	public String about()
	{
		
		return "Gunji Bank established in 2009";
	}
	
}
