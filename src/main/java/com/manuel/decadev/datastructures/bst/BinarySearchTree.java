package com.manuel.decadev.datastructures.bst;

public class BinarySearchTree {
    public BSTNode root;

    public void insert(int value){
        BSTNode node = new BSTNode(value);
        if (root == null){
            root = node;

        } else {

            BSTNode currentNode = root;

                while (true) {

                    if (value > currentNode.value) {
                        // go right
                            if (currentNode.rightNode == null) {
                                currentNode.rightNode = node;
                                break;
                            }
                            currentNode = currentNode.rightNode;
                        } else {
                        // go left
                            if (currentNode.leftNode == null) {
                                currentNode.leftNode = node;
                                break;
                            }
                            currentNode = currentNode.leftNode;
                    }
            }
        }
    }
    public BSTNode search(int searchedValue){
        //check if node exist at all
        if (root == null){
            return null;
        }

        BSTNode currentNode = root;
        // continuously loop as long as ref to currentNode is null
        while (currentNode != null){
            // check the value of the searchedValue
            if (searchedValue > currentNode.value){
                // branch right
               currentNode = currentNode.rightNode;
            } else if(searchedValue < currentNode.value){
                // branch left
                currentNode = currentNode.leftNode;

            } else {
                return currentNode;
            }
        }

        return null;
    }

    public void remove(int value){
        // check if node exist
        if (root == null){
            return;
        }
        BSTNode currentNode = root;
        while (currentNode != null){
            if (value > currentNode.value){
                currentNode = currentNode.rightNode;

            } else if(value < currentNode.value){
                currentNode = currentNode.leftNode;
            }
            else {
                BSTNode nextNode;
                if (currentNode.rightNode != null && currentNode.leftNode != null){

                    if (currentNode.rightNode.value > currentNode.leftNode.value){
                            nextNode = currentNode.rightNode;
                            nextNode.leftNode = currentNode.leftNode;
                            currentNode = nextNode;
                    }

                } else if (currentNode.rightNode != null){

                    currentNode = null;
                }

            }

        }
    }

}
