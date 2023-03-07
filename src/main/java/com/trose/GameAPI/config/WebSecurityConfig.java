package com.trose.GameAPI.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {
	
	SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
	return	http
		.csrf()
		.disable()
	    .authorizeHttpRequests((requests) -> requests
			.requestMatchers("/api/**").permitAll()
			.anyRequest())
	    .build();
		
/* 
 Do some research on authenticating/authorizing the app in order to get rid of 
 the 401 Unauthorized Response
  */
	}
}
