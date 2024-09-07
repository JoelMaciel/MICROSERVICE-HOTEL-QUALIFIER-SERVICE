package com.qualifier_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class QualifierServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(QualifierServiceApplication.class, args);
	}

}
