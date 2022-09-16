package com.in28minutes.learnspringframework.sample.enterprise.flow.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.learnspringframework.sample.enterprise.flow.business.BusinessService;

@RestController
public class Controller {

	@Autowired
	private BusinessService service;  
	
	@GetMapping("/sum")
	public long displaySum() {
		return service.calculateSum();
	}
}



