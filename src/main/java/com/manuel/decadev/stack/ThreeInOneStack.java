package com.manuel.decadev.stack;

public class ThreeInOneStack {
    int numOfStack = 3;
    int capacityOfEchStack;
    int[] values;
    int[] sizesOfEachStack;
    public ThreeInOneStack(int numOfElementForEachStack){
        this.capacityOfEchStack = numOfElementForEachStack;
        values = new int[numOfStack * numOfElementForEachStack]; // ex. 9 in total
       sizesOfEachStack = new int[numOfElementForEachStack];
    }

    public boolean isFull(int stackNum){
        if (sizesOfEachStack[stackNum] == capacityOfEchStack){
            System.out.println("The stack is full");
            return true;
        }
        return false;
    }

    public boolean isEmpty(int stackNum){
        if (sizesOfEachStack[stackNum] == 0){
            return true;
        }
        return false;
    }

    public int indexOfTopElement(int stackNum){
        int offset = stackNum * capacityOfEchStack;
        int size = sizesOfEachStack[stackNum];
        System.out.println("SIZE INSIDE INDEX_OF_TOP () "+ size);
        return offset + size - 1; //
    }

    public void push(int stackNum, int value){
        if (isFull(stackNum)){
            System.out.println("Stack is full");

        }else {
            sizesOfEachStack[stackNum]++;
            System.out.println("SIZE OF ...IN PUSH() "+sizesOfEachStack[stackNum]);
            values[indexOfTopElement(stackNum)] = value;
        }

    }

    public int pop(int stackNum){
        if (isEmpty(stackNum)){
            return -1;
        }else {
            int idx = indexOfTopElement(stackNum);
            int value  = values[idx];
            values[idx] = 0;
            sizesOfEachStack[stackNum]--;
            return value;
        }
    }

    public int peek(int stackNum){
        if (isEmpty(stackNum)){
            System.out.println("The stack is empty");
            return -1;
        } else {
           return values[indexOfTopElement(stackNum)];
        }

    }
}
