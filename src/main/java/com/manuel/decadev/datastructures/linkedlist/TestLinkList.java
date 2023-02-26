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


        /* Testing DoublyLinkedList implementation */
        DoublyLinkedList<Integer> dll = new DoublyLinkedList<>();

        dll.createNode(1);
        System.out.println("HEAD -> "+ dll.head);
        dll.insertNewNode(3, 0);
        System.out.println("NEW HEAD -> "+ dll.head);
        System.out.println("PREV NODE VALUE -> "+ dll.head.prev);
        System.out.println("NEXT NODE VALUE -> "+ dll.head.next);
//        System.out.println("NEXT NODE VALUE -> "+ dll.head.next.next);
        DoublyNode<Integer> insertedNode = dll.insertNewNode(5, 1);
        System.out.println("Testing Insertion "+insertedNode);
        System.out.println("NEXT -> " + insertedNode.next);
        System.out.println("2ND NEXT "+ insertedNode.next.next);
        System.out.println("PREV "+ insertedNode.prev);
        dll.insertNewNode(10, 1);
        dll.insertNewNode(30, 8);
        dll.printAllNodes();
        System.out.println();
       DoublyNode<Integer> res =  dll.search(40);


        dll.deleteDoublyNode(3);
        dll.printAllNodes();
    }
}
