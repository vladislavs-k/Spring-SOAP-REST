package com.in28minutes.springboot.learnjpaandhibernate.course.jdbc;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {
	
	private JdbcTemplate springJdbcTemplate;
	
	public CourseJdbcRepository(JdbcTemplate springJdbcTemplate) {
		this.springJdbcTemplate = springJdbcTemplate;
	}

	private static String INSERT_QUERY =
			"""
				INSERT INTO course (id, name, author) 
				VALUES (1, 'Learn AWS', 'in28minutes');
			""";
	
	
	public void insert() {
		springJdbcTemplate.update(INSERT_QUERY);
	}

}
