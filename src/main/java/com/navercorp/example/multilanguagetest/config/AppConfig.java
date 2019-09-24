package com.navercorp.example.multilanguagetest.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
public class AppConfig {
	/**
	 * 프로퍼티로부터 메시지를 읽기위한 MessageSource
	 *
	 * @return MessageSource 객체
	 */
	@Bean
	public MessageSource messageSource() {
		ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
		messageSource.setDefaultEncoding("UTF-8");
		messageSource.setBasename("messages/message");
		return messageSource;
	}
}
