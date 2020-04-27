package com.cg.anurag.bs;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class BookService1Application {

	public static void main(String[] args) {
		SpringApplication.run(BookService1Application.class, args);
	}

}
