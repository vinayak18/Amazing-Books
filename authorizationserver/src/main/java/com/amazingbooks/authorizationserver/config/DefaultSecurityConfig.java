package com.amazingbooks.authorizationserver.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@EnableWebSecurity
@Configuration
public class DefaultSecurityConfig {

	@Bean
    InMemoryUserDetailsManager inMemoryUserDetailsManager() {
        var one = User.withDefaultPasswordEncoder().roles("admin").username("admin").password("admin").build();
        var two = User.withDefaultPasswordEncoder().roles("user").username("user").password("password").build() ;
        return new InMemoryUserDetailsManager(one, two);
    }
    
}