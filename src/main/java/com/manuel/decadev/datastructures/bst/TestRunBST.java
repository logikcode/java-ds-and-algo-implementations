package com.manuel.decadev.datastructures.bst;

public class TestRunBST {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(4);
        bst.insert(5);
        bst.insert(3);
        bst.insert(12);
//        System.out.println(bst);
//       System.out.println(bst.root.rightNode);
//        System.out.println(bst.root.leftNode);

        System.out.println("LOOK UP VALUE "+bst.search(3));
    }
}
