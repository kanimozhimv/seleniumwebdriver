package com.in28Minutes.learn_spring_framework.examples.e1;

import java.util.Arrays;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
class NormalClass{
	
}

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
class PrototypeClass{
	
}


@Configuration
@ComponentScan("com.in28Minutes.learn_spring_framework.examples.e1")
 
public class BeanScopesLaucherApplication {
	
	
	public static void main(String args[]) {
		
 try (var context = new AnnotationConfigApplicationContext(BeanScopesLaucherApplication.class)) {
	 
	 //Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
	 System.out.println(context.getBean(NormalClass.class));
	 System.out.println(context.getBean(NormalClass.class));
	
 System.out.println(context.getBean(PrototypeClass.class));
 System.out.println(context.getBean(PrototypeClass.class));
 System.out.println(context.getBean(PrototypeClass.class));
		
	}

}}
