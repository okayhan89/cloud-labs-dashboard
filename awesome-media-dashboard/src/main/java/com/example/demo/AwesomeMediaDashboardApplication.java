package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@EnableHystrixDashboard
@SpringBootApplication
public class AwesomeMediaDashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwesomeMediaDashboardApplication.class, args);
	}
}
