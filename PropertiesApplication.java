package com.example.properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;

import java.util.Scanner;

@SpringBootApplication
@EnableConfigurationProperties(Service.class)
@PropertySource("classpath:app.properties")
public class PropertiesApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(PropertiesApplication.class, args);
		Service service = applicationContext.getBean(Service.class);

//		for (int i : service.getCountries().keySet()) {
//			System.out.println("key: " + i + " value: " + service.getCountries().get(i));
//		}

		Scanner sc = new Scanner(System.in);
		int key = sc.nextInt();
		System.out.println(service.getCountries().get(key));
	}

}
