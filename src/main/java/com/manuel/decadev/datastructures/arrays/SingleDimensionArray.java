package com.manuel.decadev.datastructures.arrays;

import java.util.Arrays;

public class SingleDimensionArray<T> {
    T [] arr;
    public SingleDimensionArray(){
        arr = (T[]) new Object[16];
        populateArray();
    }
    public SingleDimensionArray(int size){
        arr = (T[]) new Object[size];
        populateArray();
    }

    private void populateArray(){

        int i = 0;
        while (i < arr.length){
            arr[i] = null;
            i++;
        }
    }

    public void insertAtIndex(int index, T value){

        if (index >= arr.length){
            throw new ArrayIndexOutOfBoundsException("Index out of array size");
        }
        if (arr[index] == null){
            arr[index] = value;
        }
        else {

            T item = arr[index];

            while (item != null && index < arr.length){
                index++;
                item = arr[index];
            }
            if (arr[index] == null){
                arr[index] = value;
                System.out.println("Inserted successfully");

            }
        }
    }

    public void printAllItems() {
        System.out.println(Arrays.toString(arr));
    }
}
