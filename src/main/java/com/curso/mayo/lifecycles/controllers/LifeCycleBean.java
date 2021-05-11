package com.curso.mayo.lifecycles.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifeCycleBean implements BeanNameAware, InitializingBean, DisposableBean {

    /*
    * We have many rules to know
    * 1.- The method i will apply can has any modifier but can't have parameters and the return value needs to be void
    * 2.- If we have an explicit bean  we can put  @Bean (initMethod="init",destroyMethod="destroy")
    * 3.- The methods with @PostConstruct runs after of dependency injection
    * 4.- Methods with @PreDestroy that are executed before bean is destroyed
    * 5.- The method with @PreDestroy doesn't run for Prototypes (@Scope)
    * 6.- The method with @PreDestroy only will be runs when the JVM finished the execution
    * */

    private static final Logger log = LoggerFactory.getLogger(LifeCycleBean.class);


    // First to run
    @Override
    public void setBeanName(String name) {
        log.info("Bean name Aware {}", name);
    }

    // runs after the bean is built
    @PostConstruct
    public void init(){
        log.info("Post Construct");
    }

    // runs before the bean is destroy
    @PreDestroy
    public void destroyBean(){
        log.info("Pre Destroy ");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        log.info("I am afterPropertiesSet....");
    }

    @Override
    public void destroy() throws Exception {
        log.info("I'm method destroy.....");
    }
}
