package com.in28minutes.learnspringframework.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PacManGame implements GamingConsole {
	
	@Override
	public void up() {
		System.out.println("PacManGame up");
	}

	@Override
	public void down() {
		System.out.println("PacManGame down");
	}
	
	@Override
	public void left() {
		System.out.println("PacManGame left");
	}
	
	@Override
	public void right() {
		System.out.println("PacManGame right");
	}
}
