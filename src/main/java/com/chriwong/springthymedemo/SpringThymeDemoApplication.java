package com.chriwong.springthymedemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringThymeDemoApplication {

	public static void main(String[] args) {

		/* This is just to show that beans are simply objects managed by the Spring container.
		  You can create beans with one of the annotations (Component, Service, Repository, etc.)
		  Or by a @Bean-annotated method in a @Configuration-annotated class.
		 */
		ConfigurableApplicationContext context = SpringApplication.run(SpringThymeDemoApplication.class, args);
		for (String beanName : context.getBeanDefinitionNames()) {
			System.out.println(beanName);
		}
	}

}
