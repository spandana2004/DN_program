package com.example.springrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:countries.xml")
public class Application {
  public static void main(String[] args) {
    SpringApplication.run(Application.class, args);
  }
}