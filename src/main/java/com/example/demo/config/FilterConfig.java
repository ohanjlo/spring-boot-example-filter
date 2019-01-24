package com.example.demo.config;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.filter.MyFilter;
import com.example.demo.filter.MyOncePerRequestFilter;

@Configuration
public class FilterConfig {

	@Bean
	public FilterRegistrationBean myFilterRegistration() {
		FilterRegistrationBean registration = new FilterRegistrationBean();
		registration.setFilter(new MyFilter());
		registration.addUrlPatterns("/a/*");// 拦截路径
		registration.setName("MyFilter");// 拦截器名称
		registration.setOrder(1);// 顺序
		return registration;
	}

	@Bean
	public FilterRegistrationBean myOncePerRequestFilterRegistration() {
		FilterRegistrationBean registration = new FilterRegistrationBean();
		registration.setFilter(new MyOncePerRequestFilter());
		registration.addUrlPatterns("/*");// 拦截路径
		registration.setName("MyOncePerRequestFilter");// 拦截器名称
		registration.setOrder(2);// 顺序
		return registration;
	}
}