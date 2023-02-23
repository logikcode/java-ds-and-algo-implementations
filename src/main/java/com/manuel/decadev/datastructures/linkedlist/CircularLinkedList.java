package com.manuel.decadev.datastructures.linkedlist;

public class CircularLinkedList<T> {
    public Node<T> first;
    public Node<T> last;
    public int size;

    public Node<T> createNode(T value){
        Node<T> newNode = new Node<>(value); //addr: 101
        first = newNode; // first = 101
        /* ref of the next node pointing back to first node */
        newNode.nextNode = newNode; // newNode.nextNode = 101

        last = newNode; // 101
        size++;
        return newNode;
    }

    public Node<T> insertNode(int insertionPoint, T value){
        Node<T> newNode = new Node<>(value); // addr: 305
        if (first == null){
            createNode(value);
        }
        else if (insertionPoint == 0){
            Node<T> insertedNode = handleInsertWhenIndexZero(value);
            size++;
            return insertedNode;
        }
        else if (insertionPoint < size){

           Node<T> currentNode = traverseToInsertionPoint(insertionPoint);

           Node<T> nextAfterCurrent = currentNode.nextNode; // 544
            newNode.nextNode = nextAfterCurrent;
            currentNode.nextNode = newNode;
            size++;
            return newNode;

        }
        else {
            last.nextNode = newNode; // last.nextNode = 305
            newNode.nextNode = first; // newNode.nextNode = 101

            last = newNode; // last: 305
            size++;
            return newNode;
        }
       return newNode;
    }
    private Node<T> traverseToInsertionPoint(int insertionPoint){
        Node<T> currentNode = first;
        int loopStartPoint = 0;

        while (loopStartPoint < insertionPoint - 1){
            currentNode = currentNode.nextNode;
            loopStartPoint++;
        }
        return currentNode;
    }
    private Node<T> handleInsertWhenIndexZero(T value){
        Node<T> newNode = new Node<>(value); // addr: 305

        newNode.nextNode = first; // newNode.nextNode = 101
        last.nextNode = newNode; // last = 101-> 305
        first = newNode; // first = 305
        return newNode;
    }

    public void printAllNodes(){
        int start = 0;
        Node<T> currentNode = first;
        while (start != size){
            System.out.print(currentNode);
            //assert currentNode != null;
            if (start != size - 1){
                System.out.print("->");

            }
          currentNode =  currentNode.nextNode;
            start++;
        }
        System.out.println();
    }
}
