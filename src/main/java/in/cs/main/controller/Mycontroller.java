package in.cs.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Mycontroller {

	@GetMapping("/")
	@ResponseBody
	public String  hello() {
	
		return  "hello chen";
				
				
				
				
	}
}
