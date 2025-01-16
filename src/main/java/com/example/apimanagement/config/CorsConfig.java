package com.example.apimanagement.config;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {
    @Value("${cors.allowed.origins}")
    private String allowedOrigins;

    public void addCorsMappings(CorsRegistry registry) {
        // Use the allowedOrigins from the environment variable
        registry.addMapping("/**") // Allow all endpoints
                .allowedOrigins(allowedOrigins) // Set the allowed origins from the env variable
                .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Allowed HTTP methods
                .allowedHeaders("*") // Allow any headers
                .allowCredentials(true); // Allow cookies or credentials
    }
    }



