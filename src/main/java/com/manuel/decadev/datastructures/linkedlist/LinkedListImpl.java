package com.manuel.decadev.datastructures.linkedlist;

import java.util.Objects;

public class LinkedListImpl<T extends Number> {

    public Node<T> head;
    public Node<T> tail;
    public Node<T> recentNode;
    int size = 0;
    private final int ZERO = 0;
    public Node<T> createNode(T value){
        Node<T> node = new Node<>(value);

        node.nextNode = new Node<T>(null);
        head = node;
        tail = node;
         size += 1;
        return head;
    }

    public String insertNode(int location, T nodeValue){
        Node<T> newNode = new Node<>(nodeValue);

        // check if node does not already exist in the chain of nodes
        if(head == null){
            createNode(nodeValue);
            return "Node created";
        }
        if (location == ZERO){
            // assume the node should be added at first spot
            System.out.println("Executing adding in head block "+ "SIZE = "+ size + "VALUE = "+ nodeValue);
        newNode.nextNode = head;
        head = newNode;
        tail= newNode;
        size += 1;
        }
        else if(location > size ){
            // assume to be added to tail
            System.out.println("Executing adding in tail block "+ "SIZE = "+ size + " VALUE = "+ nodeValue);
            newNode.nextNode = null;
            tail.nextNode = newNode;

            tail = newNode;
           // head = tail;
            size += 1;
        }
        else {
            System.out.println("Executing adding at specified block" + "SIZE = "+ size + "VALUE = "+ nodeValue);
            Node<T> nodeAtIndex = traverseToIndex(location);

           Node<T> nodeAfterCurrent = nodeAtIndex.nextNode;
           newNode.nextNode = nodeAfterCurrent;
           nodeAtIndex.nextNode = newNode;
            size++;
            System.out.println(nodeAtIndex);
        }
        return "";
    }

    private Node<T> traverseToIndex(int index){
        int startPoint = 0;
        Node<T> currentNode = head;
        while (startPoint != index - 1){
            currentNode = currentNode.nextNode;
            startPoint++;

        }
        return currentNode;
    }

    public void removeNode(int atIndex){
            Node<T> nodeAtIndex = traverseToIndex(atIndex);
            Node<T> unwantedNode = nodeAtIndex.nextNode;
            nodeAtIndex.nextNode = unwantedNode.nextNode;
            size--;
            System.out.println(unwantedNode);
            System.out.println("SIZE AFTER REMOVAL "+ size);

    }

    public void printAllNodes(){
        int index = 0;

        Node<T> currentNode = head;

        while (index < size - 1){
            System.out.print(currentNode);
            index++;
            if (index < (size - 1) ){
                System.out.print(" -> ");

            }

            currentNode = currentNode.nextNode;

        }
        System.out.println("\n");
    }
    public T search(T value){
        //input validations
        //only proceed if node exists
        if (head != null){
            Node<T> refToFirstNode = head;
            int index = 0;
            while (index < size){

                T searchedValue = refToFirstNode.nodeValue;
                if (Objects.equals(searchedValue, value)){
                    System.out.println("FOUND NODE "+ searchedValue);
                    return searchedValue;
                }
                refToFirstNode = refToFirstNode.nextNode;
                index++;
            }

        }
        System.out.println("NOT FOUND");
        return null;
    }

    public String removeAllNodes(){
        head = null;
        tail = null;
        size = 0;
        return "Deleted";
    }
}
