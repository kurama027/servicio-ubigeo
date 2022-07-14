package com.formacionbdi.spring.app.ubigeo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class HelenaServicioUbigeoApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelenaServicioUbigeoApplication.class, args);
	}

}
