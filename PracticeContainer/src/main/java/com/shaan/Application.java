package com.shaan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Application {

	
	  public static void main(String[] args) { // TODO Auto-generated method stub
	  SpringApplication.run(Application.class, args); }
	 
	 @Bean
	  public RestTemplate getRestTemplate() {
		  return new RestTemplate();
	  }
}
