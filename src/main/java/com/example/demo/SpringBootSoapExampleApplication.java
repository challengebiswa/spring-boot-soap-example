package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@ComponentScan("com.example.*")
@SpringBootApplication
public class SpringBootSoapExampleApplication extends SpringBootServletInitializer{

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder app) { 
	  return app.sources(SpringBootSoapExampleApplication.class); 
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSoapExampleApplication.class, args);
	}

}
