package com.aerotravel.flightticketbooking.config;

import javax.validation.Validator;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.thymeleaf.extras.springsecurity5.dialect.SpringSecurityDialect;

@Configuration
public class WebConfig implements WebMvcConfigurer {

  //@Autowired
private MessageSource messageSource;
//
@Override
    public org.springframework.validation.Validator getValidator() {
        LocalValidatorFactoryBean factory = new LocalValidatorFactoryBean();
        factory.setValidationMessageSource(messageSource);
       return factory;
    }

    @Bean
    public SpringSecurityDialect securityDialect() {
       return new SpringSecurityDialect();
    }
}
