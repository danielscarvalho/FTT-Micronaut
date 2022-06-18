package com.example;

import io.micronaut.runtime.Micronaut;

public class Application {

	// WEB Service at http://localhost:8080
	
    public static void main(String[] args) {
        Micronaut.run(Application.class, args);
    }
}
