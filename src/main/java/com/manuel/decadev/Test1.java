package com.manuel.decadev;

public class Test1 {
    public static void main(String[] args) {
    double a, b, c;
    a  =  3.0 / 0;
    b = 0 / 4.0;
    c = 0 / 0.0;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);


        int nine = 9;
        System.out.println(nine++ * 9);

        double dVal = 294.00;
        double intVal = 300;

        byte convertedVal = (byte) dVal;
        byte convertedIntVal = (byte) intVal;
       // System.out.println(convertedVal + ""+ convertedIntVal);
        System.out.println(convertedVal);
        System.out.println(convertedIntVal);

    }


}
