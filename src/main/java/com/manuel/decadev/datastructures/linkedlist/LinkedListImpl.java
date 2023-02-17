package com.manuel.decadev.datastructures.linkedlist;

public class LinkedListImpl {

    public Node head;
    public Node tail;
    public Node recentNode;
    int size = 0;
    private final int ZERO = 0;
    public Node createNode(int value){
        Node node = new Node();
       // head = new Node();
        node.nodeValue = value;
        node.nextNode = new Node();
        head = node;
        tail = node;
         size += 1;
        return head;
    }

    public String insertNode(int location, int nodeValue){
        Node newNode = new Node();
        newNode.nodeValue = nodeValue;

        // check if node does not already exist in the chain of nodes
        if(head == null){
            createNode(nodeValue);
            return "Node created";
        }
        if (location <= ZERO){
            // assume the node should be added at first spot
        newNode.nextNode = head;
        head = newNode;
        size += 1;
        }
        else if(location > size ){
            // assume to be added to tail
            newNode.nextNode = null;

            tail.nextNode = newNode;
            tail = newNode;
            size += 1;
        }
        else {
            int startPoint = 0;
            Node currentNode = head;
            while (startPoint <= size - 1){
               currentNode = currentNode.nextNode;
               startPoint++;

            }
            currentNode.nextNode = newNode;
            currentNode.nextNode = null;
            System.out.println(currentNode);
        }
        return "";
    }
}
