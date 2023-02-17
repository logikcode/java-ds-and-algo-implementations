package com.manuel.decadev;

import java.util.InputMismatchException;
import java.util.List;

public class C {

    public static void main(String[] args) {
        B b = new B();
        try {
           // b.bMethod("");
        } catch (NullPointerException im){
            System.out.println("The wahala happened o");
            System.out.println( im.getMessage()  +" "+  im.getCause() ); ;
            ;
        }

        //b.doForInTry();

      // List l = b.asList();

        //System.out.println(b.toString());
      System.out.println(b.testNumAbstract());
    }
}
