package com.curso.mayo.documentationapi.controllers;

import com.curso.mayo.documentationapi.entities.SwaggerDataEntity;
import com.curso.mayo.documentationapi.services.SwaggerService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/swagger/docs")
public class DocumentationSwagger {

    @Autowired
    SwaggerService swaggerService;

    @GetMapping
    @ApiOperation(value = "Return technology that i need to use swagger2", response = SwaggerDataEntity.class)
    public ResponseEntity<List<SwaggerDataEntity>> swaggerData(){
        return new ResponseEntity<List<SwaggerDataEntity>>(swaggerService.dataSwagger(), HttpStatus.OK);
    }

}
