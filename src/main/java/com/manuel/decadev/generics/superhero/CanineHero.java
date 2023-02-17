package com.manuel.decadev.generics.superhero;

public class CanineHero <P extends SuperHearing & SuperSmell > extends SuperHero<P>{

    CanineHero(P p) {
        super(p);
    }
    void hear(){
        power.hearSubtleNoises();
    }

    void smell(){
        power.trackBySmell();
    }

}
