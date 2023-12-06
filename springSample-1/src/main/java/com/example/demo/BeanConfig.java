package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.repository.UserMapper;

@Configuration
public class BeanConfig {
    @Bean
    public UserMapper getUserMapper()
    {
        return new UserMapper();
    }
}
