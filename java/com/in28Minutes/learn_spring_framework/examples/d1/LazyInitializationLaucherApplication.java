package com.in28Minutes.learn_spring_framework.examples.d1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class ClassA{
	
	
}

@Component
@Lazy
class ClassB{
	
	private ClassA classA;
	
	public ClassB(ClassA classA) {
		System.out.println("Some Initialization logic");
		this.classA = classA;
	}


public void doSomething() {
	System.out.println("Do Something");
}
}



@Configuration
@ComponentScan("com.in28Minutes.learn_spring_framework.examples.d1")
 
public class LazyInitializationLaucherApplication {
	
	
	public static void main(String args[]) {
		
 try (var context = new AnnotationConfigApplicationContext(LazyInitializationLaucherApplication.class)) {
	 
	 //Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
	 
	 System.out.println("Initialization of Context is completed");
	 context.getBean(ClassB.class).doSomething();
	
 
		
	}

}}
