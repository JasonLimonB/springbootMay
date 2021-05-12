package com.curso.mayo.topichttp.controllers;

import com.curso.mayo.topichttp.entities.UserModel;
import com.curso.mayo.topichttp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/topic/http")
public class HttpTopicController {

    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<List<UserModel>> getAllUsers(){
        return new ResponseEntity<List<UserModel>>(userService.getAllUsers(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<UserModel> createANewUser( @RequestBody UserModel user ){
        return new ResponseEntity<UserModel>(userService.cretaeNewUer(user), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<UserModel> updateUser( @PathVariable Integer id, @RequestBody UserModel user ){
        return new ResponseEntity<UserModel>( userService.editUser(id, user), HttpStatus.CREATED );
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Integer id){
        userService.deleteUser(id);
        return new ResponseEntity<Void>( HttpStatus.NO_CONTENT );
    }

}
