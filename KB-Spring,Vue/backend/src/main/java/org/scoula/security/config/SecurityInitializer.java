package org.scoula.security.config;

import javax.servlet.ServletContext;

import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

import org.springframework.web.multipart.support.MultipartFilter;

public class SecurityInitializer extends AbstractSecurityWebApplicationInitializer {
	

	@Override
	protected void beforeSpringSecurityFilterChain(ServletContext servletContext) {
	}
}

