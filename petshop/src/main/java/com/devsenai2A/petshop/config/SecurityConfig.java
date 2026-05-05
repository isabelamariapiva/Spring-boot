package com.devsenai2A.petshop.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        http
            .csrf(csrf -> csrf.disable()) // MUITO importante
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/categoria/**").permitAll()
                .requestMatchers("/produtos/**").permitAll()
                .anyRequest().permitAll()
            )
            .formLogin(form -> form.disable()) // remove login
            .httpBasic(basic -> basic.disable()); // remove autenticação básica

        return http.build();
    }
}