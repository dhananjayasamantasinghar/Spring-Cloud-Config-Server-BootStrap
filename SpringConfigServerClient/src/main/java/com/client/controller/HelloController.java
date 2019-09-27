package com.client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.client.ConfigUtil;

@RestController
@RequestMapping("/rest")
@RefreshScope
public class HelloController {

	@Autowired
	private ConfigUtil config;
	
	@GetMapping("/msg")
	public String getMessage(){
		return "From Git Owner Name : "+config.getOwnerName();		
	}
}
