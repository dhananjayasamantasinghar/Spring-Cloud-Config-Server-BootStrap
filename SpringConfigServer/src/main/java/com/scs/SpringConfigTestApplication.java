package com.scs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringConfigTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringConfigTestApplication.class, args);
	}

}
