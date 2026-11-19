
package com.devops.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DevOpsApplication {

    public static void main(String[] args) {
        SpringApplication.run(DevOpsApplication.class, args);
    }

    @GetMapping("/")
    public String home() {
        return "Welcome to End-to-End DevOps CI/CD Pipeline!";
    }

    @GetMapping("/health")
    public String health() {
        return "Application is Healthy!";
    }

    @GetMapping("/info")
    public String info() {
        return "Application deployed using Jenkins, Maven, SonarQube, Docker and AWS EC2.";
    }
}
