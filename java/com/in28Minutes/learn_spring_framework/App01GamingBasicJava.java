package com.in28Minutes.learn_spring_framework;

import com.in28Minutes.learn_spring_framework.game.GameRunner;
import com.in28Minutes.learn_spring_framework.game.MarioGame;
import com.in28Minutes.learn_spring_framework.game.SuperContraGame;
import com.in28Minutes.learn_spring_framework.game.PacMan;


public class App01GamingBasicJava {

	public static void main(String[] args) {
		
		//var game = new MarioGame();
		var game = new PacMan();
		//var game = new SuperContraGame();
		//var gameRunner = new GameRunner(marioGame);
		var gameRunner = new GameRunner(game);
		
		gameRunner.run();
	}

}
