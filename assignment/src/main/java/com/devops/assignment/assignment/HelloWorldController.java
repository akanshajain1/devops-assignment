package com.devops.assignment.assignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/hello")
public class HelloWorldController {
 
	public ApplicationProperties appProp;

	@Autowired
	public void setAppProp(ApplicationProperties appProp) {
		this.appProp = appProp;
	}

	@GetMapping("/id")
	public ResponseEntity<String> sendHelloResponse(){
		return new ResponseEntity<String>("Hello World"+"  "+appProp.getTextbox(),HttpStatus.OK);
				
	}
}
