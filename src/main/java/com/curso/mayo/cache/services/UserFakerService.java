package com.curso.mayo.cache.services;

import com.curso.mayo.cache.entities.UserFakerEntity;
import com.github.javafaker.Faker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserFakerService {

    @Autowired
    private Faker faker;

    private List<UserFakerEntity> users = new ArrayList<>(100);
    private Logger log = LoggerFactory.getLogger(UserFakerService.class);

    @PostConstruct
    private void init(){
        for (int i =0; i<100; i++)
            users.add(new UserFakerEntity(faker.funnyName().name(), faker.name().username(), faker.dragonBall().character()));

    }

    public List<UserFakerEntity> getUsers() {
        log.info("Getting user from Service");
        return users;
    }


    /*
    * In this method i'm going to declare the name that i put in the bean and wee need use the annotation
    *   @Cacheable
    * I used Thread.sleep to simulate a slow petition and when we'll do a request the first time it'll take 3 seconds but the second time only it will take milliseconds
    * */
    @Cacheable("users")
    public UserFakerEntity findByNickName( String name ){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return users.stream().filter( dato -> dato.getName().equals(name) ).collect(Collectors.toList()).get(0);
    }

    /*
    * we need the mehtod for delete an user then we will implement clean cache
    * */

    @CacheEvict("users")
    public void deleteUser(String name){
        users.removeIf(u -> u.getName().equals(name));
    }

}
