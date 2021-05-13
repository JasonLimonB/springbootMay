package com.curso.mayo.cache.controllers;

import com.curso.mayo.cache.entities.UserFakerEntity;
import com.curso.mayo.cache.services.UserFakerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cache")
public class CacheExampleController {

    @Autowired
    UserFakerService fakerService;

    @GetMapping
    public ResponseEntity<List<UserFakerEntity>> users(){
        return new ResponseEntity<List<UserFakerEntity>>( fakerService.getUsers(), HttpStatus.OK );
    }

    @GetMapping("/{name}")
    public ResponseEntity<UserFakerEntity> finsByNickName(@PathVariable String name){
        return new ResponseEntity<UserFakerEntity>( fakerService.findByNickName(name), HttpStatus.FOUND );
    }

}
