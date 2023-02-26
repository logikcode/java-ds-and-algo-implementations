package com.manuel.decadev.datastructures.linkedlist;

public class DoublyNode<T> {
    public DoublyNode<T> next;
    public DoublyNode<T> prev;
    private final T  value;
    public DoublyNode(T value){
        this.value = value;
    }
    @Override
    public String toString(){
        return value.toString();
    }
    public T getValue(){
        return this.value;
    }
}
