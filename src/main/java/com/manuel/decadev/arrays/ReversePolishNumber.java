package com.manuel.decadev.arrays;

import java.util.Stack;

public class ReversePolishNumber {
    public static void main(String[] args) {
        String [] tokens = {"1", "4", "+", "3", "*", "9", "-", "3", "/"};
        System.out.println("RES " + reversePolishCalc(tokens));
    }
    public static int reversePolishCalc(String [] tokens){
        String mathOps = "*+-/";
        Stack<String> values = new Stack<>();
        //loop over the string arrays
        for (String token : tokens){
            // push to stack if not any of mathOPs values
            if (!mathOps.contains(token)){
                values.push(token);
            } else {

                int topVal = Integer.parseInt(values.pop());
                int nextTopVal = Integer.parseInt(values.pop());


                switch (token){
                    case "+":
                        values.push(String.valueOf(topVal + nextTopVal ));
                        System.out.println(values.peek());
                        break;
                    case "*":
                        values.push(String.valueOf(topVal * nextTopVal ));
                        System.out.println(values.peek());
                        break;
                    case "-":
                        if (topVal > nextTopVal){
                            values.push(String.valueOf(nextTopVal - topVal ));

                        } else {
                            values.push(String.valueOf(topVal - nextTopVal));
                            System.out.println(values.peek());
                        }

                        break;
                    case "/":
                        values.push(String.valueOf(topVal / nextTopVal ));
                        System.out.println(values.peek());
                        break;
                }

            }

        }
        int res = Integer.parseInt(values.pop());
        return res;
    }
}
