package com.shaan.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.shaan.model.CryptoResponse;

@Service
public class ApplicationService {
	
	@Autowired 
	RestTemplate restTmp;
	
	public void bitCoinData() {
		HttpHeaders header = new HttpHeaders();
		header.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		HttpEntity <String> entity = new HttpEntity<String>(header);
		String response = restTmp.exchange("https://api.coindesk.com/v1/bpi/currentprice.json", HttpMethod.GET, 
					entity,
				String.class).getBody();
 		System.out.println(response);
 		
 		ObjectMapper obj = new ObjectMapper();
 		try {
			CryptoResponse cryptoResponse = obj.readValue(response,CryptoResponse.class);
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
