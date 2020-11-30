package com.tachyon.retail.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostalController {

	@GetMapping("/v1/postal/{postalId}")
	public String getRetail(@PathVariable(value = "postalId") int postalId)
	{
		System.out.println("In Get Postal service postalId::" + postalId);		
		return "Get postal for " + postalId;
	}
	
	@PostMapping("/v1/postal/{postalId}")
	public String postRetail(@PathVariable(value = "postalId") int postalId)
	{
		System.out.println("In Post Retail service postalId::" + postalId);		
		return "Post postal";
	}
	
}
