package com.crazycoder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        // This is the first method calls when starting the web application
        SpringApplication.run(Application.class, args);

    }
}
