package com.newmonopoly;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.newmonopoly.ObjectDAO;

@SpringBootApplication
public class Application {
	@Autowired
	ObjectDAO dao;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}