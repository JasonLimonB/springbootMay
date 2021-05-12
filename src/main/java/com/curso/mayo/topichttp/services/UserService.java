package com.curso.mayo.topichttp.services;

import com.curso.mayo.topichttp.IUsers;
import com.curso.mayo.topichttp.entities.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class UserService{

    @Autowired
    private IUsers iUsers;

    public List<UserModel> getAllUsers(){
        return iUsers.findAll();
    }

    public UserModel cretaeNewUer( UserModel user ){
        if( user != null )
            return iUsers.save(user);
        else
            throw new ResponseStatusException(HttpStatus.FOUND,String.format("The user %s exist", user.toString()));
    }

    public UserModel editUser( Integer id, UserModel user){
        Optional<UserModel> data = iUsers.findById(id);
        if( data.isPresent())
            return iUsers.save(user);
        else
            throw new ResponseStatusException(HttpStatus.FOUND,String.format("The user %s doesn't exist", user.toString()));
    }

    public void deleteUser( Integer id ){
        Optional<UserModel> result = iUsers.findById(id);
        if(result.isPresent())
            iUsers.delete(result.get());
        else
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, String.format("The user with ID %s doesn't existe", id));
    }

}
