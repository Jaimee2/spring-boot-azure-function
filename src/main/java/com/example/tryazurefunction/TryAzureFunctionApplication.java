package com.example.tryazurefunction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;

@SpringBootApplication
public class TryAzureFunctionApplication {

    public static void main(String[] args) {
        SpringApplication.run(TryAzureFunctionApplication.class, args);
    }

    @Bean
    public Function<String, String> uppercase() {
        return payload -> {
            String output = payload.toUpperCase();
            return String.format("Input: %s", output);
        };
    }

}
