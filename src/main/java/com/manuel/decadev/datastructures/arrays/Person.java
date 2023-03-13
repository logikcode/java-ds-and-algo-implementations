package com.manuel.decadev.datastructures.arrays;

public class Person {
    String name;
    String phone;
    String email;
    public Person(String name, String phone, String email){
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public String toString(){
        return name + " "+ phone;
    }
}
