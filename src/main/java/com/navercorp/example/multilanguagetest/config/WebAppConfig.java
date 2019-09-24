package com.navercorp.example.multilanguagetest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@Import(AppConfig.class)
@EnableWebMvc
@ComponentScan(basePackages = {"com.navercorp.example.multilanguagetest"})
public class WebAppConfig implements WebMvcConfigurer {
	/**
	 * jsp 파일을 뷰로 보여주기 위한 ViewResolver
	 *
	 * @return ViewResolver 객체
	 */
	@Bean
	public ViewResolver viewResolver() {
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}

	/**
	 * 기본 서블릿 등록.
	 * 등록된 요청, 자원을 제외한 모든 요청은 기본 서블릿이 처리한다.
	 */
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}
}
