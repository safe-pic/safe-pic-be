package com.root.checkerly;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CheckerlyApplication {

	public static void main(String[] args) {
		// Load .env variables
		Dotenv dotenv = Dotenv.configure().load();

		// Automatically set all .env variables to System properties
		dotenv.entries().forEach(entry -> System.setProperty(entry.getKey(), entry.getValue()));

		SpringApplication.run(CheckerlyApplication.class, args);
	}

}
