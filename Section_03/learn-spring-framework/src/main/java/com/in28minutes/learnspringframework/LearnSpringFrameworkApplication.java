package com.in28minutes.learnspringframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.in28minutes.learnspringframework.game.GameRunner;

@SpringBootApplication
//@ComponentScan("com.in28minutes.learnspringframework | com.in28minutes.dummy")
//@ComponentScan({"com.in28minutes.learnspringframework", "com.in28minutes.dummy"})
public class LearnSpringFrameworkApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = 
				SpringApplication.run(LearnSpringFrameworkApplication.class, args);
		
		GameRunner runner = context.getBean(GameRunner.class);
		runner.runGame();

	}

}


//S3: Section 3 completed!
