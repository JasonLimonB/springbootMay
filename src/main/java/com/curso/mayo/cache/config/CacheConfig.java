package com.curso.mayo.cache.config;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableCaching
public class CacheConfig {

    /*
    * First we have to add the dependency then we need to create a bean like this.
    * URL = https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-cache
    * */

    @Bean
    public CacheManager getCache(){
        return new ConcurrentMapCacheManager("users"); // The parameter is the name that i want to assign
    }

}
