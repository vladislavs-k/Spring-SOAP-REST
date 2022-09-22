package com.in28minutes.rest.webservices.restfulwebservices.helloworld;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	private MessageSource messageSource;

	public HelloWorldController(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

//	@RequestMapping(method = RequestMethod.GET, path = "/hello-world")
	@GetMapping("/hello-world")
	public String helloWorld() {
		return "Hello world!!!";
	}

	@GetMapping("/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello World JSON");
	}

	@GetMapping("/hello-world/path-variable/{name}")
	public HelloWorldBean helloWorlPathVariable(@PathVariable String name) {
//		return new HelloWorldBean("Hello World, " + name);
		return new HelloWorldBean(String.format("Hello World, %s!", name));
	}

	@GetMapping("/hello-world-internationalized")
	public String helloWorldInternationalized() {
		Locale locale = LocaleContextHolder.getLocale();
		return messageSource.getMessage("good.morning.message", null, "Default Message", locale);
//		return "Hello world V2";
	}

}
