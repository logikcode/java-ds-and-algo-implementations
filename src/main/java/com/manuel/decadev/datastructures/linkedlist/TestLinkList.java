package com.manuel.decadev.datastructures.linkedlist;

public class TestLinkList {
    public static void main(String[] args) {
        int idx = 0;
        LinkedListImpl ll = new LinkedListImpl();
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
    }
}
