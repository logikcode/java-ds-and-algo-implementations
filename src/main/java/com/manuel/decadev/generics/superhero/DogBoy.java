package com.manuel.decadev.generics.superhero;

public class DogBoy extends CanineHero<SuperHearSmell>{
    SuperHearSmell superHearSmell;
    DogBoy(SuperHearSmell superHearSmell) {
        super(superHearSmell);
    }
    void doSomething(){
       superHearSmell = new SuperHearSmell();
       superHearSmell.trackBySmell();
    }

}
