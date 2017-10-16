package com.cloud.lab3server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class Lab3ServerApplication {

	//Run this on localhost 8001 and go to http://localhost:8001/lab-3-client/default
	//lab 2 client is the name of the app defined on the remote server config file, default is the well...default profile
	public static void main(String[] args) {
		SpringApplication.run(Lab3ServerApplication.class, args);
	}
}
