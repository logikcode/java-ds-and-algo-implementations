package com.manuel.decadev.generics.coffees;

import com.manuel.decadev.generics.CoffeeGenerator;

import java.util.Iterator;

public class CoffeeIterator implements Iterator<Coffee> {
    int count = new CoffeeGenerator().size;

    @Override
    public boolean hasNext() {
        return new CoffeeGenerator().size > 0;
    }

    @Override
    public Coffee next() {
        count--;
        return new CoffeeGenerator().next();
    }

    @Override
    public void remove() {
        Iterator.super.remove();
    }
}
