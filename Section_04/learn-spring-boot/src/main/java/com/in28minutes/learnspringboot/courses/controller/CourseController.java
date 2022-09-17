package com.in28minutes.learnspringboot.courses.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.learnspringboot.courses.bean.Course;

@RestController
public class CourseController {

	@GetMapping("/courses")
	public List<Course> gelAllCourses() {
		return List.of(new Course(1, "Learn Microservices", "in28minutes"),
				new Course(2, "Full Stack", "in28minutes"));
	}
	
	@GetMapping("/courses/1")
	public Course getCourse() {
		return new Course(1, "Learn Microservices devtools", "in28minutes");
	}
}
