package com.manuel.decadev.datastructures.arrays;

import java.util.Random;

public class TwoDimensionalArray {
    int[][] int2DArray;
    public TwoDimensionalArray(){
    int2DArray = new int[16][16];
    }
    public TwoDimensionalArray(int rowSize, int colSize){
    int2DArray = new int[rowSize][colSize];
    }

    public void populateArray(){
        Random rand = new Random(47);
        int i = 0;
        int len = 10;
        int rowIndex = 0;
        int colIndex = 0;
        int j = 0;

        while (i < len){

            while (j < len){
                j++;
                int value = rand.nextInt(50);
                int2DArray[rowIndex][colIndex] = value;
                colIndex++;
            }
            i++;
            j = 0;
            rowIndex++;
            colIndex = 0;
        }

    }

}
