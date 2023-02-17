package com.manuel.decadev;

public class UnderstandingException {


    public static void main(String[] args) {

        try {
            method1();
        } catch (Exception ex) {
            ex.printStackTrace();

        }
    }
    
    
    static void method1() throws Exception{
        try {
            method2();
        } catch (Exception exception){
            throw new Exception("Method 1 Exception Object", exception);
        }

    }

    private static void method2() throws Exception {
        throw new Exception("Exception from method 2");
    }
}
