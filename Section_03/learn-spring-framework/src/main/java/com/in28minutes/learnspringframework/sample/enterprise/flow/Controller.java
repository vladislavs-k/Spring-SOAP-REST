package com.in28minutes.learnspringframework.sample.enterprise.flow;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@GetMapping("/sum")
	public long displaySum() {
		return 100;
	}
}

class BusinessService {
	
}

class DataSevice {
	
}
