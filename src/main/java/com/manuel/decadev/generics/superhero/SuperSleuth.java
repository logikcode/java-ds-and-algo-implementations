package com.manuel.decadev.generics.superhero;

public class SuperSleuth <POWER extends XrayVision> extends SuperHero<POWER>{

    SuperSleuth(POWER p) {
        super(p);
    }

    void see(){
        power.seeThroughWalls();

    }

}
