package com.manuel.decadev;

public class Circle {

    int radius = 0;
    final private double PI = 3.14;

    public Circle (int radius){
        this.radius = radius;
    }

    public void swapInt(){

    }

    public double getArea(){
        return radius * radius * PI;
    }

    public static void swap(Circle x, Circle y){

        Circle temp = x;
        x = y;
        y = temp;
        System.out.println(x.toString());
        System.out.println(y.toString());

    }

    public static void swap2(Circle c1, Circle c2){
        int temp = c1.radius;
       c1.radius = c2.radius;
        c2.radius = temp;

    }

    public int getRadius(){

        return this.radius;
    }

    public void setRadius(int radius){
        this.radius = radius;
    }

}
