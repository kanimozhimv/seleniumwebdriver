package com.in28Minutes.learn_spring_framework.examples.g1;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.inject.Inject;
import jakarta.inject.Named;


//@Component
@Named
class BusinessService{
	private DataService dataservice;
	
	//@Autowired
	@Inject
	public void setDataservice(DataService dataservice) {
		this.dataservice = dataservice;
	}

	
	public DataService getDataservice() {
		System.out.println("Setter Injection would be performed");
		
		return dataservice;
	}
	
	
	
}
@Component
class DataService{
	
}


@Configuration
@ComponentScan("com.in28Minutes.learn_spring_framework.examples.g1")
 
public class CDIContextLaucherApplication {
	
	
	public static void main(String args[]) {
		
 try (var context = new AnnotationConfigApplicationContext(CDIContextLaucherApplication.class)) {
	 
	 Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
	 System.out.println(context.getBean(BusinessService.class).getDataservice());
	
 
		
	}

}}
