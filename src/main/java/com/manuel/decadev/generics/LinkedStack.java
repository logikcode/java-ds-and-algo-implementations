package com.manuel.decadev.generics;

import java.util.Arrays;

public class LinkedStack<T,U> {

    private class Node{
    U item;
    Node next;

    Node(){
        item = null;
        next = null;
    }

    Node(U item, Node next){
        this.item = item;
        this.next = next;
    }

    boolean end(){
        return item == null && next == null;
    }

    }

    private Node top = new Node();

    public void push(U item){

        top = new Node(item, top);
    }

    public U pop(){
        U result = top.item;
        if(!top.end()){
            top = top.next;
        }
        return  result;
    }

    public static void main(String[] args) {
        LinkedStack<String, String> ls = new LinkedStack<>();
        String[] words = new String[]{"Phasers on stun!"};

        words = "Phasers on stun!".split(" ");
        for (String w :words){
            ls.push(w);
        }
        String s;
        while (( s = ls.pop()) != null){
            System.out.println(s.toUpperCase());

        }
    }
}
