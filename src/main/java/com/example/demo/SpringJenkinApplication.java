package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class SpringJenkinApplication {

public static Logger logger=LoggerFactory.getLogger(SpringJenkinApplication.class);
	
  @PostConstruct
	public void init() {
		logger.info("Application  started .....");
	}
	
	public static void main(String[] args) {
		logger.info("Application executed...");
		SpringApplication.run(SpringJenkinApplication.class, args);
	}

}
