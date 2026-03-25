package com.in28Minutes.learn_spring_framework.helloworld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age) {};
record Address(String firstLine, String city) {};

@Configuration
public class HelloWorldConfiguration {
	@Bean
	public String name() {
		return "Kani";
	}
	
	@Bean
	public int age() {
		return 20;
	}
	@Bean
	public Person person() {
		//var person = new Person("Mozhi",25);
		return new Person("Mozhi",25);
	}
	@Bean
	public Address address() {
		//var person = new Person("Mozhi",25);
		return new Address("Fairfax","Centreville");
	}

}
