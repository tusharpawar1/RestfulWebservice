package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GreetService {

	@RequestMapping("/greet")
	public @ResponseBody String getService(){
		return "Hello World";
	}
}
