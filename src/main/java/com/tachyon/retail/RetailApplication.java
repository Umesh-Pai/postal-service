package com.tachyon.retail;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by umesh.pai on 01/16/2018.
 */

@SpringBootApplication
public class RetailApplication {
	
	public static void main(String[] args) {
		System.out.println("In retail service");
		
		SpringApplication.run(RetailApplication.class, args);
	}
}
