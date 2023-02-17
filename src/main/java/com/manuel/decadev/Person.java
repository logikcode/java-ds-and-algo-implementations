package com.manuel.decadev;

import java.util.Comparator;

public class Person implements Comparable<Person> {
    public String name;
   public String birthplace;
   private String degree;
    private int age;

    Person(String nam, String birthplace, String higestDegree, int age){
        name = nam;
        this.birthplace = birthplace;
        this.degree = higestDegree;

        this.age = calcAge(age);

    }

    private int calcAge(int age){

        return age;
    }

public  void setAge(int theAge){
        age = theAge;
}


    public void showInfo(){
        System.out.println("These are your info:");
        System.out.println(name);
        System.out.println(birthplace);
        System.out.println(degree);
        System.out.println(age);
        System.out.println();
    }



    public void showThis(){
        System.out.println(this);
    }

//    @Override
//    public int compare(Person o1, Person o2) {
//        return 0;
//    }

    @Override
    public int compareTo(Person o) {
        char p1 = birthplace.charAt(0);
         char p2 = o.birthplace.charAt(0);
         //return p1 - p2;
        return 0;
    }
}
