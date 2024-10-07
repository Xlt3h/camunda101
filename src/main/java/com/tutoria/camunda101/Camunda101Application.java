package com.tutoria.camunda101;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.camunda.zeebe.spring.client.annotation.Deployment;

@SpringBootApplication
@Deployment(resources = "classpath*:/process/**/*.bpmn")
public class Camunda101Application {

	public static void main(String[] args) {
		SpringApplication.run(Camunda101Application.class, args);
	}

}
