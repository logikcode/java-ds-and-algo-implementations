package com.manuel.decadev;

import java.util.*;

public class ArrayListLinkedList {

    // create instance of arraylist
    static List <Integer> listarray = new ArrayList<>();
   static   LinkedList<Object>  linkedList;
   static List<Integer> color1 = Arrays.asList(34, 26,78);
   static List <Integer> color2 = Arrays.asList( 90, 8, 0);


    public static void main(String[] args) {
        addToList(listarray);
        listarray.add(0, 10);
        listarray.add(3,30);


        System.out.print(listarray);
       linkedList = new LinkedList<Object>(listarray);
        addToLinkedList();

        iterateListForward(linkedList);
        iterateListBackward(linkedList);

        linkedList.removeFirst();
        linkedList.removeLast();
        ListIterator<String> iterator;

        //printList(linkedList);
        System.out.println("-----------------------------------");

        //color1.addAll(color2);
        //printList(color1);


    }

    static void addToList(List<Integer> list){

        for (int i = 1; i <= 5; i += 1) {
            list.add(i);
        }

    }

   static void addToLinkedList (){
        linkedList.add(1, "Red");
        linkedList.add(2,"Blue");
        linkedList.add(3, "White");
        linkedList.add(4, "Black");
       System.out.println();
        System.out.println(linkedList);
    }

    static void iterateListForward( LinkedList<Object> list){
        ListIterator<Object> it = list.listIterator();
        while (it.hasNext()){
            Object element = it.next();
            System.out.print(element + " ");

        }
        System.out.println();
    }


    static void iterateListBackward( LinkedList<Object> list){
        ListIterator<Object> it = list.listIterator(list.size());
        while (it.hasPrevious()){
            Object element = it.previous();
            System.out.print(element + " ");

        }
        System.out.println();
    }
    static void printList(List<Integer> list){
        for(Integer element : list){
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
