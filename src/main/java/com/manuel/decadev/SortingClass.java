package com.manuel.decadev;

import java.util.ArrayList;
import java.util.Date;

public class SortingClass {
    private static ArrayList dates = new ArrayList<>();
    public  SortingClass(){}

    public static void main(String[] args) {
        int[] ints = {0,3,2,1,9,476,55,-1};
        //  7,8,0,4,3,66,5,1,0,-1
        sortInts(ints);
        for (int i : ints){
            System.out.print(i);

        }


        //System.out.println(ints[1] + "<->" + ints[2]);
    }

    static void sortInts(int[] arrayOfInts){

        int initialMin;
        int currentMin = 0;
        int indexOfCurrentMin = 0;


        for(int i = 0; i < arrayOfInts.length; i++) {
            initialMin = arrayOfInts[i];

            for (int innerIndex = i + 1; innerIndex < arrayOfInts.length; innerIndex += 1){
                int nextEl = arrayOfInts[innerIndex];

                if (nextEl < initialMin){
                    currentMin = nextEl;
                    indexOfCurrentMin = innerIndex;
                }

            }
            if (arrayOfInts[indexOfCurrentMin] < initialMin) {
                arrayOfInts[i] = currentMin;
                arrayOfInts[indexOfCurrentMin] = initialMin;
            }

        }

        }


}
