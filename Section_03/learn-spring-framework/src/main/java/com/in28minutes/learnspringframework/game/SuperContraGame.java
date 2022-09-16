package com.in28minutes.learnspringframework.game;

public class SuperContraGame implements GamingConsole {
	
	@Override
	public void up() {
		System.out.println("SuperContraGame up");
	}

	@Override
	public void down() {
		System.out.println("SuperContraGame down");
	}
	
	@Override
	public void left() {
		System.out.println("SuperContraGame left");
	}
	
	@Override
	public void right() {
		System.out.println("SuperContraGame right");
	}
}
