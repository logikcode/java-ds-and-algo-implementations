package com.manuel.decadev;


import java.util.Arrays;
import java.util.List;

public class B extends A implements IWorkWithInterface {
    IWorkWithInterface i;
public B (){
    //super();
}

@Override
public void m1(){
}
public void bMethod(String s){
   if (s != null)
       throw new NullPointerException("Wahala go happen here");
}


public void doForInTry(){

    try {
        for (int i = 0; i < 10; i++){
            System.out.println("Doing the division now");
            System.out.println(1/0);
        }
    }catch(ArithmeticException ae){
        System.out.println("But e blow up");
    }


    }

    public List<String[]> asList(){
       return Arrays.asList(new String[][]{{"Name", "Age", "Address"}});

    }

    public Integer testNumAbstract(){

    Integer numRef = 10;
   // Double dbRef = (Double) numRef;

        Number[] numArray = new Integer[2];
        numArray[0] = new Integer(20);
        //numArray[1] = new Double (40);
        //System.out.println(numArray[0].intValue());
       // System.out.println(numArray[1].doubleValue());
        Number n = 10;
        System.out.println(n.intValue());
        System.out.println(n.doubleValue());


        return numRef.intValue();
    }

}

