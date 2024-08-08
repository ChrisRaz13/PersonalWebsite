package com.personalwebsite.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean 
    SecurityFilterChain createFilterChain(HttpSecurity http) throws Exception {
        http
            .csrf(csrf -> csrf.disable())
            .authorizeHttpRequests(authorize -> authorize
                .anyRequest().permitAll()) // Allow all requests without authentication
            .sessionManagement(management -> management
                .sessionCreationPolicy(SessionCreationPolicy.STATELESS));
        return http.build();
    }
}
