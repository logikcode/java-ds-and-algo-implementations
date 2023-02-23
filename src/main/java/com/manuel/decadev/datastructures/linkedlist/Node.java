package com.manuel.decadev.datastructures.linkedlist;

public class Node <V> {
    public V nodeValue;
    public Node<V> nextNode;
    public Node(V v){
    this.nodeValue = v;
    }
    @Override
    public String toString(){

        return nodeValue + "";
    }
}
