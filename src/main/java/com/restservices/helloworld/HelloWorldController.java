package com.restservices.helloworld;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//Controller
@RestController

public class HelloWorldController {
	@RequestMapping(method=RequestMethod.GET, path="/helloworld")
 public String greet() {
	 return ("Hello World!");
	 
 }
	 @GetMapping("/helloworldbean")
	 public UserDetails helloworldbean() {
		 UserDetails ud= new UserDetails("Hema","Sinha","Giridih");
		 return ud;
	 }
}
