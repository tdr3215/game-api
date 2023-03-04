package com.trose.GameAPI.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig {
	
	SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
	return	http
		.csrf()
		.disable()
		.build();
/* 
 Do some research on authenticating/authorizing the app in order to get rid of 
 the 401 Unauthorized Response
  */
	}
}
