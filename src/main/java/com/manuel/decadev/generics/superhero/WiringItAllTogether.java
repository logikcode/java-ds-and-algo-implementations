package com.manuel.decadev.generics.superhero;

import com.manuel.decadev.generics.ImplBothInterface;
import com.manuel.decadev.generics.InterfaceOne;
import com.manuel.decadev.generics.InterfaceTwo;

public class WiringItAllTogether {

    public static void main(String[] args) {
    useSuperHearing(new CanineHero<SuperHearSmell>(new SuperHearSmell()));
    superFind(new CanineHero<>(new SuperHearSmell()));
    genericMethod(new ImplBothInterface());
    }

    static <P extends SuperHearing> void useSuperHearing(SuperHero<P> hero){
        hero.getPower().hearSubtleNoises();

    }

    static <P extends SuperHearing & SuperSmell> void superFind(SuperHero<P> superHero){
        superHero.getPower().hearSubtleNoises();
        superHero.getPower().trackBySmell();
    }
    static < T extends InterfaceOne & InterfaceTwo> void genericMethod(T both){

    }
}
