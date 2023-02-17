package com.manuel.decadev;

public class RecurTest {
    public static void main(String[] args) {
        System.out.println("I am writing recursion");
        int res = factorial(3);
        System.out.println("Factorial is "+ res);
        //System.out.println(("res: "+recurMethod(20)));
        //System.out.println(powerOfX(3));
        System.out.println(" Recurse Number Series " +recurseNumSeries(1));
    }


    public static int factorial(int n){
        if (n == 0)
            return n;
        return factorial(n-1);

    }

    public static int recurMethod(int n){
        int sum = 0;
        if (n > 0){
           recurMethod(n / 10);
        }
        return sum;
    }

    public static int powerOfX(int n){
        // 2^n = if n = 3 => 2 * 2 * 3
        int base = 2;
        int defaultValue = 1;
        if (n == 0){
            return defaultValue;
        }

        return base *  powerOfX(n-1);
    }

    public static int recurseNumSeries(int n){
        int end = 6;
        int base = n;
        System.out.print(n+" ");
        if(n == end){
            return 0;
        }
        if (n < 1){
            return n;
        }


        return n + recurseNumSeries(n + 1);
    }

}
