package com.alexis.interview;



import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {


    public static void main(String[] args) {
        System.out.println("DISPLAY BEFORE SPRING CONTEXT LOADING");
        SpringApplication.run(Application.class, args);
    }

    public void run(String... args) {
        System.out.println("DISPLAY AFTER SPRING CONTEXT LOADING");

    }


}
