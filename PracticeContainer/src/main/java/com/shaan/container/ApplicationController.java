package com.shaan.container;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.MediaTypeEditor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.shaan.service.ApplicationService;

@RestController
public class ApplicationController {
	
	@Autowired
	RestTemplate restTmp; 
	
	@Autowired
	ApplicationService service;
	
	@GetMapping("/helloWorld")
	String helloWord() {
		System.out.println("test");
		service.bitCoinData();
		return "Hello World!!";
	}
	
}
