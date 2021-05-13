package com.curso.mayo.cache.config;

import com.github.javafaker.Faker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FakerBean {

    @Bean
    public Faker getFaker(){
        return new Faker();
    }

}
