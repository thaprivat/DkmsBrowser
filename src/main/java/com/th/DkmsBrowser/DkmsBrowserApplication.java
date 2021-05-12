package com.th.DkmsBrowser;

import java.util.concurrent.TimeUnit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import org.springframework.boot.autoconfigure.orm.jpa.*;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.CacheControl;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@Configuration
@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class })
@SpringBootApplication
public class DkmsBrowserApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(DkmsBrowserApplication.class, args);
	}

	@Configuration
	public class WebConfig implements WebMvcConfigurer {
		@Override
		public void addResourceHandlers(ResourceHandlerRegistry registry) {
			registry.addResourceHandler("/**").addResourceLocations("classpath:/static/", "classpath:/image/")
					.setCachePeriod(0);
		}
	}
}
