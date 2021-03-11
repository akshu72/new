package com.sct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EnableJpaRepositories
@SpringBootApplication
public class NewManyToManyApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewManyToManyApplication.class, args);
	}

}
