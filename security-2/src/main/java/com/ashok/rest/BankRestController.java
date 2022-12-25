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
}
