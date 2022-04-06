package com.example.SpringSecurityMW;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import com.example.SpringSecurityMW.Repositories.UserRepository;
@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
public class SpringSecurityMwApplication {
public static void main(String[] args) {
SpringApplication.run(SpringSecurityMwApplication.class, args);
System.out.println("Running...");
}
}