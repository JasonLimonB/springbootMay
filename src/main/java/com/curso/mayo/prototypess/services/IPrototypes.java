package com.curso.mayo.prototypess.services;

import com.curso.mayo.prototypess.config.ExampleClass;
import com.curso.mayo.prototypess.entities.PrototypesEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IPrototypes {

    List<PrototypesEntity> getPrototypes();

    ExampleClass getExplicitBean();

}
