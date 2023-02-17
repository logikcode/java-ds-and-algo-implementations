package com.manuel.decadev.generics;

import com.manuel.decadev.generics.coffees.*;

import java.util.Iterator;
import java.util.Random;

public class CoffeeGenerator  implements Iterable<Coffee> {
    public Random rand = new Random(47);
    public static int size = 0;

    public CoffeeGenerator(){};
    public CoffeeGenerator(int size){
        this.size = size;
    }

    private Class[] objects = {Mocha.class, Cappucino.class, Breeve.class,
            Latte.class, Americano.class};

    public Coffee next() {
        try {
            return  (Coffee) objects[rand.nextInt(objects.length)].newInstance();
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Iterator<Coffee> iterator() {
        return new CoffeeIterator();
    }

    public class CoffeeIterator implements Iterator<Coffee> {
        int count = size;

        @Override
        public boolean hasNext() {
            return count > 0;
        }

        @Override
        public Coffee next() {
            count--;
            return  CoffeeGenerator.this.next();
        }

        @Override
        public void remove() {
            Iterator.super.remove();
        }
    }


    public static void main(String[] args) {
        CoffeeGenerator coffeeGenerator = new CoffeeGenerator();
        for (int i = 0; i < 5; i++){
            System.out.println(coffeeGenerator.next());
            for (Coffee c : new CoffeeGenerator(5)){
                System.out.println(c);
            }
        }
    }
}
