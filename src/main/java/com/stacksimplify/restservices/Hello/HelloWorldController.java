package com.stacksimplify.restservices.Hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//controller
@RestController
public class HelloWorldController {
  
	//method
	//URI
	//GET --method type
	
	//@RequestMapping(method=RequestMethod.GET, path="/helloworld")
	@GetMapping("/helloworld1")
	public String helloWorld() {
		return "HEllo World 1";
	}
	
     @GetMapping("/helloworld-bean")	
	 public UserDetails helloworldbean() {
		  return new UserDetails("bharath","balabhadra","warnagal");
		 
	 }
	
	
}
