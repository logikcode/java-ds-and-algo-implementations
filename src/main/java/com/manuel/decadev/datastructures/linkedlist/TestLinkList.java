package com.manuel.decadev.datastructures.linkedlist;

public class TestLinkList {
    public static void main(String[] args) {
        int idx = 0;
        LinkedListImpl<Integer> ll = new LinkedListImpl<>();
        ll.createNode(5);
        ll.insertNode(2, 99);
        ll.insertNode(1, 100);

        while (idx < 20){
            ll.insertNode(idx, idx + 1);
            idx++;
        }

       ll.printAllNodes();

       ll.removeNode(1);
        ll.printAllNodes();
        ll.search(5);
        ll.search(2);
        ll.removeAllNodes();
        System.out.println(ll.head);
        System.out.println(ll.tail);
        // testing the implementation of circular link list
        System.out.println("PRINTING CIRCULAR LINK LIST");
        CircularLinkedList<Integer> circularLinkedList = new CircularLinkedList<>();
        circularLinkedList.createNode(1);
        System.out.println(circularLinkedList.first); // 1

        //circularLinkedList.printAllNodes();
        Node<Integer> node =  circularLinkedList.insertNode(0, 2);

        System.out.println(circularLinkedList.first); // 2
        circularLinkedList.insertNode(90, 67);

        System.out.println(circularLinkedList.last); // 67
        System.out.println(circularLinkedList.last.nextNode); // 2




    }
}
