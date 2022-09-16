package com.in28minutes.learnspringframework.game;

public class GameRunner {

	private GamingConsole game;

	
	public GameRunner(GamingConsole game) {
		this.game = game;
	}
	
	public void runGame() {
		game.up();
		game.down();
		game.left();
		game.right();
	}

}
