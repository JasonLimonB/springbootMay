package com.curso.mayo.prototypess.entities;

import lombok.Data;

@Data
public class PrototypesEntity {

    private String name;
    private String whenUse;

    public PrototypesEntity(){}

    public PrototypesEntity(String name, String whenUse) {
        this.name = name;
        this.whenUse = whenUse;
    }
}
