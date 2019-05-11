package com.leave;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class LeaveApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {		
		
		SpringApplication.run(LeaveApplication.class, args);
	}
}
//java -jar target/demo-0.0.1-SNAPSHOT.jar