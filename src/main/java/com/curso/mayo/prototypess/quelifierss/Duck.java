package com.curso.mayo.prototypess.quelifierss;

import org.springframework.stereotype.Component;

@Component("duck")
public class Duck implements Animal{


    @Override
    public String eat() {
        return "Hi, I'm a duck and i'm going to eat grass";
    }

    @Override
    public Integer numLegs() {
        return 2;
    }
}
