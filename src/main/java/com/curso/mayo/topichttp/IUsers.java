package com.curso.mayo.topichttp;

import com.curso.mayo.topichttp.entities.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsers extends JpaRepository<UserModel, Integer> {
}
