package com.example.demo.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyFilter implements Filter {

	private static final Logger log = LoggerFactory.getLogger(MyFilter.class);

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		log.info("MyFilter 初始化中...");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		log.info("进入 MyFilter");
		chain.doFilter(request, response);
	}

	@Override
	public void destroy() {
		log.info("MyFilter 销毁中...");
	}
}
