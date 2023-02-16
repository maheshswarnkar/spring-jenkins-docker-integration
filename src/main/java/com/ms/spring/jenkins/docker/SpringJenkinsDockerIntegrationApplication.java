package com.ms.spring.jenkins.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/api")
public class SpringJenkinsDockerIntegrationApplication {

	@GetMapping(value = "/message")
	public String helloMessage() {
		return "Hello Mahesh!! First Integration of SpringBoot-Docker-Jenkins !!";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringJenkinsDockerIntegrationApplication.class, args);
	}

}
