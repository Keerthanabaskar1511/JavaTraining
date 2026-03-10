package com.wipro.employee2.config;

	import org.springframework.context.annotation.Bean;
	import org.springframework.context.annotation.Configuration;
	import org.springframework.security.authentication.AuthenticationProvider;
	import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
	import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
	import org.springframework.security.core.userdetails.*;
	import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
	import org.springframework.security.crypto.password.PasswordEncoder;
	import org.springframework.security.provisioning.InMemoryUserDetailsManager;

	@Configuration
	@EnableWebSecurity
	public class SecurityConfig {

	    // USERS
	    @Bean
	    public UserDetailsService userDetailsService() {

	        UserDetails user1 = User.builder()
	                .username("user")
	                .password(passwordEncoder().encode("123"))
	                .roles("USER")
	                .build();

	        UserDetails admin = User.builder()
	                .username("admin")
	                .password(passwordEncoder().encode("admin123"))
	                .roles("ADMIN")
	                .build();

	        return new InMemoryUserDetailsManager(user1, admin);
	    }

	    // PASSWORD ENCODER
	    @Bean
	    public PasswordEncoder passwordEncoder() {
	        return new BCryptPasswordEncoder();
	    }

	    // AUTH PROVIDER (THIS IS WHAT YOUR IMAGE SHOWS)
	    @Bean
	    public AuthenticationProvider authProvider() {

	        DaoAuthenticationProvider dao = new DaoAuthenticationProvider();
	        dao.setUserDetailsService(userDetailsService());
	        dao.setPasswordEncoder(new BCryptPasswordEncoder()); // <-- your screenshot line

	        return dao;
	    }
	}

