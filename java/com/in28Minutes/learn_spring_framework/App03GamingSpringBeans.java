package com.in28Minutes.learn_spring_framework;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.in28Minutes.learn_spring_framework.game.GameRunner;
import com.in28Minutes.learn_spring_framework.game.GamingConsole;

public class App03GamingSpringBeans {
	
	public static void main(String args[]) {
		
 try (var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)) {
	context.getBean(GamingConsole.class).up();
	context.getBean(GameRunner.class).run();
} catch (BeansException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
 
		
	}

}
