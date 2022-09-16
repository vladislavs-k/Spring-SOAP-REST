package com.in28minutes.learnspringframework.game;

public class GameRunner {
//	private MarioGame game;
	private SuperContraGame game;

//	public GameRunner(MarioGame game) {
//		this.game = game;
//	}
	
	public GameRunner(SuperContraGame game) {
		this.game = game;
	}
	
	public void runGame() {
		game.up();
		game.down();
		game.left();
		game.right();
	}

}
