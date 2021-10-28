package com.nilcelsoestudo.projetoopenfeign2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableFeinClients
public class Projetoopenfeign2Application {

	public static void main(String[] args) {
		SpringApplication.run(Projetoopenfeign2Application.class, args);
	}

}
