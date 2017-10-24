package com.jaiseSpring5.Spring5App1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages= "com.jaiseSpring5.*")
//@EntityScan("com.jaiseSpring5.model")
public class Spring5App1Application {

	public static void main(String[] args) {
		SpringApplication.run(Spring5App1Application.class, args);
	}
}
