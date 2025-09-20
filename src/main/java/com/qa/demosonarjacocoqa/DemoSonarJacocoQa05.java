package com.qa.demosonarjacocoqa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoSonarJacocoQa05 {
	private static final Logger logger = LoggerFactory.getLogger(DemoSonarJacocoQa05.class);

	public static void main(String[] args) {
		//Comentario 01
		logger.info("Ingresando a proyecto DemoSonarJacocoQa04");
		SpringApplication.run(DemoSonarJacocoQa05.class, args);
	}

}