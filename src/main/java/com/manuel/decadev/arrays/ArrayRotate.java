package com.manuel.decadev.arrays;

import java.util.Arrays;

public class ArrayRotate {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(rotateRotate(nums, 7)));
    }
    public static int[] rotateRotate(int []numArray, int k){

        int [] resultArray = new int[numArray.length];
        int numPos = numArray.length - 1;
        for (int i = 0; i < k; i++){ //loop k times
            resultArray[i] = numArray[numPos];
            numPos--;
        }

        for (int j = 0; j < numArray.length - k; j++){
            resultArray[j+k] = numArray[j];
        }

        //return resultArray;
        System.arraycopy(resultArray,0,numArray,0,numArray.length);
        return numArray;
    }
}
