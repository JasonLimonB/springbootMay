package com.curso.mayo.cache.entities;

import lombok.Data;

@Data
public class UserFakerEntity {

    private String nickname;
    private String name;
    private String password;

    public UserFakerEntity(String nickname, String name, String password) {
        this.nickname = nickname;
        this.name = name;
        this.password = password;
    }

    public UserFakerEntity() {}
}
