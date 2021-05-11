package com.phong.spring.themeleafweb.config;

import com.phong.spring.themeleafweb.models.TodoValidator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TodoConfig {
    @Bean
    public TodoValidator validator(){
        return new TodoValidator();
    }
}
