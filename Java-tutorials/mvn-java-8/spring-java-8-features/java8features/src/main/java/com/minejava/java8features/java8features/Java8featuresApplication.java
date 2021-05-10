package com.minejava.java8features.java8features;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lambdas.LambdaExample;

@SpringBootApplication
public class Java8featuresApplication {
	private static final Logger log = LoggerFactory.getLogger(Java8featuresApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(Java8featuresApplication.class, args);

		// Create an object of Lambda Example class
		LambdaExample lambdaExample = new LambdaExample();
		log.info("result:" + lambdaExample.additionOperator(5, 4));
	}

}
