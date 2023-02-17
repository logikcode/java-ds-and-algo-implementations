package com.manuel.decadev.datastructures;

import java.util.Arrays;
import java.util.Scanner;

public class TestMain {
   static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // get inpu tfrom the keyboard
        // method to sort array
        // method to print the array

        int [] myIntArray = {8,5,2,1,6};
        System.out.println(Arrays.toString(sortArray(myIntArray))) ;
        System.out.println("SORTED ARRAY"+ Arrays.toString(sortIntArray())) ;
       System.out.println("REVERSED ARRAY + "+ Arrays.toString(reverseArray()));
       int[] insArray = new int[]{9,2,1,0};
        insertionSortingArray(insArray);
        System.out.println("INSERTION RESULT "+Arrays.toString(insArray));
        //reverseArray();
    }

    public static int[] getInput(){
        int[] unsortedNum = new int[5];

        System.out.println("Enter 5 number!");
        for (int i = 0; i < 5; i+=1){
           unsortedNum[0] = scanner.nextInt();
        }
        return unsortedNum;
    }

    public static int[] sortArray(int[] nums){
        // go through all, find the biggest
        // 85, 4,6,90,4,1
        int len = nums.length;
        int[] newArr = new int[len];
        int INIT =0;
        int biggest;
        System.out.println("LENGTH: "+ len);
        for(int i = 0; i <= len-1; i++){
            int temp;
            biggest = nums[i];
            for (int j = i; j <= len-1; j++) {

                if (nums[j] > biggest) {

                    biggest = nums[j];
                     nums[j] = nums[i];

                }

            }
            newArr[i] = biggest;


        }
        return newArr;
    }

    public static int[] sortIntArray(){
        int [] array = {47,2,90,22,5};
        // go over the array as long as condition is true
        boolean flag = true;
        while (flag){
            flag = false;
            for (int i = 0; i < array.length-1; i++){
                // check if the 1st ele is less than 2nd
                // then if true swap the two
                if (array[i] < array[i+1]){
                    int temp = array[i+1];
                    array[i+1] = array[i];
                    array[i] = temp;
                    flag = true;
                }

            }
        }


        return array;
    }

    public static int[] reverseArray(){
        int [] array =new int []{9,8,7,6,5,4,3,2,1};

        // go through the array.
        // take the last element
        // exchange the position of the last element with the first element
        // {9,8,7}
        int len = array.length-1;
        int lastIndex = len;
        for (int i = 0; i < len / 2; i++){
            int lastElem = array[lastIndex];
            int temp = array[i];
            array[i] = lastElem;
            array[lastIndex] = temp;
            lastIndex--;

        }
        return array;
    }

    public static void insertionSortingArray(int[] numbs){
        //{2,9,4,5,1,8}
        // step on each elem one at a time till end
        for (int i =1; i < numbs.length; i++){

            int k;
            int currElem = numbs[i]; // index 2 == 9
            int prevPos;
            int nextPos = i;
            int temp = 0;
            for (k = i - 1, prevPos = k;  k >= 0 && currElem < numbs[prevPos]; k--, prevPos--){ // swap only if previous last sorted numb is bigger
                 temp = numbs[prevPos];      //                                                    // than the currunt numb to be inserted
                numbs[prevPos] = numbs[nextPos];
            }
            numbs[nextPos] = temp;
        }

    }
}
