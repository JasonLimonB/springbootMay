package com.curso.mayo.prototypess.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyExplicitBean {

    @Bean
    public ExampleClass getMyBean(){
        return new ExampleClass();
    }

}
