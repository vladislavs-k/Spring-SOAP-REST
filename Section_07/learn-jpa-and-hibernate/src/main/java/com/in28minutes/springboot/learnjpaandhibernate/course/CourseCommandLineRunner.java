package com.in28minutes.springboot.learnjpaandhibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.in28minutes.springboot.learnjpaandhibernate.course.jpa.CourseJpaRepository;
import com.in28minutes.springboot.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner{

//	@Autowired
//	private CourseJdbcRepository repository;
	
//	@Autowired
//	private CourseJpaRepository repository;
	
	@Autowired
	private CourseSpringDataJpaRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
//		repository.insert(new Course(1, "JPS Learn AWS Now!", "in28minutes"));
//		repository.insert(new Course(2, "JPS Learn Azure Now!", "in28minutes"));
//		repository.insert(new Course(3, "JPS Learn DevOps Now!", "in28minutes"));
		repository.save(new Course(1, "Spring Data JPA Learn AWS Now!", "in28minutes"));
		repository.save(new Course(2, "Spring Data JPA Learn Azure Now!", "in28minutes"));
		repository.save(new Course(3, "Spring Data JPA Learn DevOps Now!", "in28minutes"));
		
		repository.deleteById(1l);
		
		System.out.println(repository.findById(2l));
		System.out.println(repository.findById(3l));
		
		System.out.println("=========================================================");
		System.out.println(repository.findAll());
		System.out.println();
		System.out.println(repository.count());
		System.out.println();
		System.out.println(repository.findByAuthor("in28minutes"));
		System.out.println(repository.findByAuthor(""));
		System.out.println();
		System.out.println(repository.findByName("pring Data JPA Learn AWS Now!"));
		System.out.println(repository.findByName("Spring Data JPA Learn DevOps Now!"));
	}

}
