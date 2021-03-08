package com.sct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class NewAssignMentApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewAssignMentApplication.class, args);
	}

//	@Bean
//	public RestTemplate restTemplate()
//	{
//		RestTemplate rt=restTemplate();
//		return rt;
//		
//	}
}
