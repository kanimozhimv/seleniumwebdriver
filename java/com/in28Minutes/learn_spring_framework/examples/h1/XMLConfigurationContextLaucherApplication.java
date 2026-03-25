package com.in28Minutes.learn_spring_framework.examples.h1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
@ComponentScan("com.in28Minutes.learn_spring_framework.examples.a1")
 
public class XMLConfigurationContextLaucherApplication {
	
	
	public static void main(String args[]) {
		
 try (var context = new ClassPathXmlApplicationContext("ContextConfiguration.xml")) {
	 
	 Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
	
 
		
	}

}}
