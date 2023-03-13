package com.manuel.decadev.datastructures.bst;

public class BSTNode {
    public int value;
    public BSTNode rightNode;
    public BSTNode leftNode;

    public BSTNode(int value){
        this.value = value;
    }
    public String toString(){
       return String.valueOf(value);
    }
}
