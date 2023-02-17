package com.manuel.decadev.generics.superhero;

public class SuperHero < POWER extends SuperPower>{
    POWER power;
    SuperHero(POWER p){
        this.power = p;
    }
    POWER getPower(){
        return power;
    }

}
