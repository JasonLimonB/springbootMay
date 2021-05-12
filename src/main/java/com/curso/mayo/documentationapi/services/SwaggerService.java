package com.curso.mayo.documentationapi.services;

import com.curso.mayo.documentationapi.entities.SwaggerDataEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SwaggerService {

    public List<SwaggerDataEntity> dataSwagger(){
        List<SwaggerDataEntity> data = new ArrayList<>(2);
        data.add(new SwaggerDataEntity("Swagger2", "2.9.2", "https://mvnrepository.com/artifact/io.springfox/springfox-swagger2"));
        data.add(new SwaggerDataEntity("Swagger2 UI", "2.9.2", "https://mvnrepository.com/artifact/io.springfox/springfox-swagger-ui"));
        return data;
    }

}
