package com.springdemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan({"com.springdemo.controller"})
public class ServletConfig {
	
	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver res = new InternalResourceViewResolver();
		res.setPrefix("/WEB-INF/");
		res.setSuffix(".jsp");
		return res;
	}

}
