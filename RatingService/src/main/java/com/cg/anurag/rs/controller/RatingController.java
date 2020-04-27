package com.cg.anurag.rs.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cg.anurag.rs.dto.Book;
import com.cg.anurag.rs.dto.Rating;
@RestController
public class RatingController 
{
    @Autowired
    RestTemplate restTemplate;
    public void setRestTemplate( RestTemplate  restTemplate)
    {
    	this.restTemplate= restTemplate;
    }
    
    @Bean
    @LoadBalanced
    public  RestTemplate restTemplate()
    {
    	return new RestTemplate();
    }
    
    @GetMapping("/getRating/{bookId}")
    public Rating getRating(@PathVariable int bookId)
    {
    	 /*Book book = restTemplate.exchange("http://book-service/getBook/",HttpMethod.GET,
    			 null,Book.class,bookId).getBody();*/
    	 Book book =restTemplate.getForEntity("http://book-service/getBook/", Book.class).getBody();
    	 return new Rating(7001,5,book);
    }
    
}








