package com.postinforg.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {
	
//	@Autowired
//	CommonInterceptor commonInterceptor;

//	public void addInterceptors(InterceptorRegistry registry) {
//		registry.addInterceptor((HandlerInterceptor) this.commonInterceptor)
//				.addPathPatterns("/**/*")
//				.excludePathPatterns("/resource/**", "/error", "/login/**")
//				.excludePathPatterns("/swagger-resources/**",
//						"/swagger-ui.html",
//						"/v3/api-docs",
//						"/webjars/**");
//	}

	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**").allowedOrigins(new String[] { "*" });
	}

	public void addResourceHandlers(ResourceHandlerRegistry registry) {
//		registry.addResourceHandler("swagger-ui.html")
//        	.addResourceLocations("classpath:/META-INF/resources/");
//		registry.addResourceHandler("/webjars/**")
//        	.addResourceLocations("classpath:/META-INF/resources/webjars/");
	}
	
}
