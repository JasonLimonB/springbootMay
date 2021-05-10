package com.curso.mayo.prototypess;

import com.curso.mayo.prototypess.entities.PrototypesEntity;
import com.curso.mayo.prototypess.services.PrototypesServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("prototypes")
public class PrototypesController {

    private PrototypesServiceImpl prototypesService;

    @Autowired
    public PrototypesController(PrototypesServiceImpl prototypesService) {
        this.prototypesService = prototypesService;
    }

    @GetMapping
    public ResponseEntity<List<PrototypesEntity>> detailProto(){
        return new ResponseEntity<List<PrototypesEntity>>(prototypesService.getPrototypes(), HttpStatus.OK);
    }

    @GetMapping("/bean")
    public ResponseEntity<String> getExplicitBean(){
        return new ResponseEntity<String>(prototypesService.getExplicitBean().getMessge(), HttpStatus.OK);
    }

}
