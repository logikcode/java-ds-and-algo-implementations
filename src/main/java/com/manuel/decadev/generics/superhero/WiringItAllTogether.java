package com.manuel.decadev.generics.superhero;

public class WiringItAllTogether {

    public static void main(String[] args) {
    useSuperHearing(new CanineHero<SuperHearSmell>(new SuperHearSmell()));
    superFind(new CanineHero<>(new SuperHearSmell()));
    }

    static <P extends SuperHearing> void useSuperHearing(SuperHero<P> hero){
        hero.getPower().hearSubtleNoises();

    }

    static <P extends SuperHearing & SuperSmell> void superFind(SuperHero<P> superHero){
        superHero.getPower().hearSubtleNoises();
        superHero.getPower().trackBySmell();
    }
}
