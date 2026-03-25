package com.in28Minutes.learn_spring_framework.examples.f1;

import java.util.Arrays;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;



@Component
class SomeClass{
	
	private SomeDependency somedependency;
	
	public SomeClass(SomeDependency somedependency) {
		super();
		this.somedependency = somedependency;
		System.out.println("All dependencies are ready");
	}
	
	@PostConstruct
	public void initialize() {
		somedependency.getReady();
	}
	@PreDestroy
	public void cleanup() {
		System.out.println("Clean up");
	}
}
@Component
class SomeDependency{

	public void getReady() {
		System.out.println("some logic using somedependency");
		
	}
	
}


@Configuration
@ComponentScan("com.in28Minutes.learn_spring_framework.examples.f1")


 
public class PrePostAnnotationContextLaucherApplication {
	
	
	public static void main(String args[]) {
		
 try (var context = new AnnotationConfigApplicationContext(PrePostAnnotationContextLaucherApplication.class)) {
	 
	 Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
	
 
		
	}

}}
