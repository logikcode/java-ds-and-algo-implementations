package com.manuel.decadev.datastructures.arrays;

import java.util.Arrays;

public class TestArrayImplementation {
    public static void main(String[] args) {
        SingleDimensionArray<Integer> sda = new SingleDimensionArray<>();

        sda.insertAtIndex(0, 1);
        sda.insertAtIndex(0, 2);
        sda.insertAtIndex(0, 3);
        sda.insertAtIndex(0, 4);
        sda.insertAtIndex(5, 5);
        sda.insertAtIndex(4, 6);
        sda.insertAtIndex(4, 7);
        sda.printAllItems();
        SingleDimensionArray<Person> sdaOfPersons = new SingleDimensionArray<>(3);
        sdaOfPersons.insertAtIndex(0, new Person("Adewale", "0902", "ade@mail"));
        sdaOfPersons.insertAtIndex(1, new Person("Mike", "0802", "ade@mail"));
        sdaOfPersons.insertAtIndex(0, new Person("Ige", "07067", "ade@mail"));
        sdaOfPersons.printAllItems();

        TwoDimensionalArray int2Darray = new TwoDimensionalArray(10, 10);
        int2Darray.populateArray();
        System.out.println(Arrays.deepToString(int2Darray.int2DArray));
        System.out.println(int2Darray.int2DArray.length);


    }
}
