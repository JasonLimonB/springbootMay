package com.curso.mayo.lifecycles.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/lifecycles")
public class LifeCycless {

    @Autowired
    private LifeCycleBean bean;

    @GetMapping
    public ResponseEntity<String> lifeCycleMethod(){
        bean.setBeanName("Bean Name Aware");
        return new ResponseEntity<String>("Example", HttpStatus.OK);
    }

}
