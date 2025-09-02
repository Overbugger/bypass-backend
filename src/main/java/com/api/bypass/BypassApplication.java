package com.api.bypass;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditorProvider")
public class BypassApplication {

	public static void main(String[] args) {
		SpringApplication.run(BypassApplication.class, args);
	}

}
