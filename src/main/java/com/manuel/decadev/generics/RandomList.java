package com.manuel.decadev.generics;

import java.util.ArrayList;
import java.util.Random;

public class RandomList <T>{
    private ArrayList<T> store = new ArrayList<>();
    private Random rand = new Random(47);

    public void addToStore(T item){
        store.add(item);
    }

    public T select(){
        int storeSize = store.size();
        int randomLocation = rand.nextInt(storeSize);
       return store.get(randomLocation);
    }

    public static void main(String[] args) {
        RandomList<String> stringContainer = new RandomList<>();

        for (String s : "I am the fucking developer".split(" ")){
            stringContainer.addToStore(s);
        }

        int len = stringContainer.store.size();
        int counter = 0;

       while (stringContainer.select() != null && counter < len){
           System.out.println(stringContainer.select());
           counter++;
       }

    }
}
