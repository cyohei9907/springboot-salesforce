package com.easylearnjava.springbootsalesforce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableOAuth2Sso
public class SpringbootSalesforceApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(SpringbootSalesforceApplication.class, args);
	}
}
