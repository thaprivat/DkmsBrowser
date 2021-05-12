package com.th.DkmsBrowser.security;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.Configuration;

import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;

import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration

public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Bean

	public PasswordEncoder passwordEncoder() {

		return new BCryptPasswordEncoder();

	}

	@Override

	protected void configure(final AuthenticationManagerBuilder auth) throws Exception {

		auth

				.inMemoryAuthentication()

				.withUser("th")

				.password(passwordEncoder().encode("dummy1"))

				.roles("USER")

				.and()

				.withUser("admin")

				.password(passwordEncoder().encode("admin"))

				.roles("USER", "ADMIN");

	}

}
