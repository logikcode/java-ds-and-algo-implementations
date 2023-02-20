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
        if (location == ZERO){
            // assume the node should be added at first spot
            System.out.println("Executing adding in head block "+ "SIZE = "+ size + "VALUE = "+ nodeValue);
        newNode.nextNode = head;
        head = newNode;
        size += 1;
        }
        else if(location > size ){
            // assume to be added to tail
            System.out.println("Executing adding in tail block "+ "SIZE = "+ size + " VALUE = "+ nodeValue);

            newNode.nextNode = null;
            tail.nextNode = newNode;

            tail = newNode;
            size += 1;
        }
        else {
            System.out.println("Executing adding at specified block" + "SIZE = "+ size + "VALUE = "+ nodeValue);
            Node nodeAtIndex = traverseToIndex(location);

           Node nodeAfterCurrent = nodeAtIndex.nextNode;
           newNode.nextNode = nodeAfterCurrent;
           nodeAtIndex.nextNode = newNode;
            size++;
            System.out.println(nodeAtIndex);
        }
        return "";
    }

    private Node traverseToIndex(int index){
        int startPoint = 0;
        Node currentNode = head;
        while (startPoint != index -1){
            currentNode = currentNode.nextNode;
            startPoint++;

        }
        return currentNode;
    }

    public void removeNode(int atIndex){
            Node nodeAtIndex = traverseToIndex(atIndex);
            Node unwantedNode = nodeAtIndex.nextNode;
            nodeAtIndex.nextNode = unwantedNode.nextNode;
            size--;
            System.out.println(unwantedNode);
            System.out.println("SIZE AFTER REMOVAL "+ size);

    }

    public void printAllNodes(){
        int index = 0;

        Node currentNode = head;

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
}
