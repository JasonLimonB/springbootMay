package com.curso.mayo.prototypess;

import com.curso.mayo.prototypess.entities.PrototypesEntity;
import com.curso.mayo.prototypess.quelifierss.Animal;
import com.curso.mayo.prototypess.services.PrototypesServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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


    /*
    * In this case we can use Qualifire or Primary but teh anotation Primary we need put in the class @Primary
    * i prefer use Qualifier
    * */
    @Qualifier("duck")
    private Animal animal;

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

    @GetMapping("/animal")
    public ResponseEntity<String> getAniaml(){
        return new ResponseEntity<String>(animal.eat()+" and i have " +animal.numLegs() +" legs", HttpStatus.OK );
    }

}
