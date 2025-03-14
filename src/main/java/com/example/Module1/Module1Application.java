package com.example.Module1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.Module1", "modules"})
@EntityScan(basePackages = "modules")
@EnableJpaRepositories(basePackages = "modules")
public class Module1Application {
    public static void main(String[] args) {
        SpringApplication.run(Module1Application.class, args);
    }
}
//http://localhost:8080/swagger-ui/index.html