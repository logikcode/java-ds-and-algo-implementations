package com.manuel.decadev.datastructures.linkedlist;

public class TestLinkList {
    public static void main(String[] args) {
        LinkedListImpl ll = new LinkedListImpl();
        Node node = ll.createNode(2);
        ll.insertNode(9,90);
        ll.insertNode(10, 100);
//        ll.insertNode(1,5);
//        ll.insertNode(9,50);
        System.out.println("head node "+ ll.head);
        System.out.println("next node "+ ll.head.nextNode);
        System.out.println("tail node " +ll.tail);
        System.out.println("tail node " +ll.tail.nextNode);

//        System.out.println(ll.head.nextNode); // exp: 90
//        System.out.println(ll.head.nextNode.nextNode); // exp: 5
//        System.out.println(ll.head.nextNode.nextNode.nextNode); // exp: 50
        System.out.println("length = " +ll.size);

    }
}
