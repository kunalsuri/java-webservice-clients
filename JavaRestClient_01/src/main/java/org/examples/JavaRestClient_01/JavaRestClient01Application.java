package org.examples.JavaRestClient_01;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class JavaRestClient01Application {

	static final String URL_REST = "http://localhost:3030/userslist";
	public static void main(String[] args) {
		//SpringApplication.run(JavaRestClient01Application.class, args);

		System.out.println("==== Hello ====");

		RestTemplate restTemplate = new RestTemplate();

		// Send request with GET method and default Headers.
		String result = restTemplate.getForObject(URL_REST, String.class);

		System.out.println(result);
	}

}