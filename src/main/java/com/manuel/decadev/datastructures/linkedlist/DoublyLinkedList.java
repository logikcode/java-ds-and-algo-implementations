package com.manuel.decadev.datastructures.linkedlist;

public class DoublyLinkedList<E> {
    public DoublyNode<E> head;
    public DoublyNode<E> tail;
    public int size = 0;

    public DoublyNode<E> createNode(E value){
        DoublyNode<E> newNode = new DoublyNode<>(value);
        newNode.next = null;
        newNode.prev = null;
        head = newNode;
        tail = newNode;
        size++;
        return newNode;
    }

    public DoublyNode<E> insertNewNode(E value, int pos){
        DoublyNode<E> newNode  = new DoublyNode<>(value);
        DoublyNode<E> currentNode;
        DoublyNode<E> prevNode;
        DoublyNode<E> nextNode;
        int ZERO  = 0;

        if (head == null) {
            return createNode(value);
        }
        else if(pos == ZERO){
            // attach the node at the beginning of the chain
            newNode.next = head;
            newNode.prev = null;
            head.prev = newNode;
            head = newNode;
            System.out.println("PRINTING HEAD "+ head);
            size++;
            return newNode;
        } else if (pos < size){
            currentNode = traverseToIndex(pos);
            System.out.println("PRINTING CURRENT "+ currentNode);
            nextNode = currentNode.next;
            currentNode.next = newNode;
            newNode.prev = currentNode;
            newNode.next = nextNode;
            nextNode.prev = newNode;

        size++;

        return currentNode;
        }

        else {
            System.out.println("EXECUTING ELSE BLOCK");
            System.out.println("TAIL "+ tail);

            newNode.next = null;
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
            size++;
            return newNode;
        }

    }
    private DoublyNode<E> traverseToIndex(int index){

        int start = 0;
        DoublyNode<E> currentNode = head;
        while (start < index-1){
            currentNode = currentNode.next;
            start++;
        }
        return currentNode;
    }
    public void printAllNodes(){
        int start = 0;
        DoublyNode<E> currentNode = head;
        while (start < size-1){
            System.out.print(currentNode +" ");
            currentNode = currentNode.next;
            start++;
        }
        System.out.print(currentNode);
    }

    public DoublyNode<E> get(int index){
        return traverseToIndex(index + 1);
    }

    public DoublyNode<E> search(E value){
        int start = 0;
        DoublyNode<E> current = head;

        while (start < size){
            if (current.getValue() == value){
                System.out.println("found "+current );
                return current;
            }
            current = current.next;
            start++;
        }
        System.out.println(value +" Not found ");
        return null;
    }

    public DoublyNode<E> deleteDoublyNode(E value){
        // traverse to the node in question
        DoublyNode<E> nodeToDelete ;
        DoublyNode<E> nextNode;
        DoublyNode<E> prevNode;

        int indexOfNodeToDelete = indexOf(value);
        if (indexOfNodeToDelete < 0){
        return null;
        }
        else if (indexOfNodeToDelete == 0){
            // delete at beginning
            System.out.println("DELETING AT HEAD ");
            nodeToDelete = search(value);
             nextNode = nodeToDelete.next;

            nextNode.prev = null;
            head = nextNode;
            size--;
        }
         else if (indexOfNodeToDelete + 1  == size){
            // deleting at the tail
            System.out.println("DELETING AT TAIL ");

            nodeToDelete = search(value);
           prevNode = nodeToDelete.prev;
            prevNode.next = null;
            tail = prevNode;
            System.out.println("NEW TAIL "+ tail);
            System.out.println("TAIL PREV "+ tail.prev);
            System.out.println("TAIL NEXT "+ tail.next);
            size--;
        } else {

       nodeToDelete = search(value);
       nextNode = nodeToDelete.next;

       prevNode = nodeToDelete.prev;
       nextNode.prev = prevNode;
       prevNode.next = nextNode;
        size--;
        System.out.println("DELETED "+ nodeToDelete);
            System.out.println("NEXT NODE "+ nextNode);
            System.out.println("NEXT PREVIOUS "+ nextNode.prev);
            System.out.println("NEXT PREVIOUS NEXT "+ nextNode.prev.next.next);
         }
        return nodeToDelete;
    }
    public int indexOf(E value){
        int startIndex = 0;
        int nodeIndex = 0;

        if (head == null) {
            return -1;
        }
        DoublyNode<E> currentNode = head;

        if (checkValue(currentNode, value)) {
            return nodeIndex;
        }

        while (startIndex < size -1 ){

            if (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            nodeIndex++;
            if (checkValue(currentNode, value)){
                return nodeIndex;
            }

            startIndex++;

        }
        return -1;
    }
    private boolean checkValue(DoublyNode<E> node, E value){
        return node.getValue() == value;
    }
}
