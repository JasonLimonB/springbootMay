package com.curso.mayo.documentationapi.entities;


import lombok.Data;

@Data
public class SwaggerDataEntity {

    private String name;
    private String version;
    private String urlRepository;

    public SwaggerDataEntity(String name, String version, String urlRepository) {
        this.name = name;
        this.version = version;
        this.urlRepository = urlRepository;
    }

    public SwaggerDataEntity() {
    }

}
