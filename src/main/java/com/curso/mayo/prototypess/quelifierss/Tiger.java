package com.curso.mayo.prototypess.quelifierss;

import org.springframework.stereotype.Component;

@Component("tiger")
public class Tiger implements Animal{
    @Override
    public String eat() {
        return "Hi, I'm a tiger and i'm gonna eat a zebra ";
    }

    @Override
    public Integer numLegs() {
        return 4;
    }
}
