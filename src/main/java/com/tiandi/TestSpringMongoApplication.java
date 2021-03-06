package com.tiandi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
public class TestSpringMongoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestSpringMongoApplication.class, args);
	}
}
