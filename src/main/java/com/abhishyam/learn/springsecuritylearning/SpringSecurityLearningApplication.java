package com.abhishyam.learn.springsecuritylearning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class SpringSecurityLearningApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityLearningApplication.class, args);
	}

	@Bean
	public PasswordEncoder generatePasswordEncoder(){
		return PasswordEncoderFactories.createDelegatingPasswordEncoder();
	}
}
