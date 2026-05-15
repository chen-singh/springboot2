package in.cs.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Mycontroller {

	@GetMapping("/")
	public String  hello() {
		return  "hello chen";
				
				
				
				
	}
}
