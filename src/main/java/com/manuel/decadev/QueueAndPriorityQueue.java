package com.manuel.decadev;

import java.util.*;

public class QueueAndPriorityQueue {
    static Queue<Integer> integerQueue;
    public static void main(String[] args) {
        integerQueue = new LinkedList<>();
        Queue<Person> strQueue = new PriorityQueue<>(4, Collections.reverseOrder());

        setupQueue(integerQueue);

        for (Integer element : integerQueue){
            System.out.print(element + " ");
        }

        strQueue.offer(new Person("Emmanuel", "Lagos", "BSC", 34));
        strQueue.offer(new Person("Yumanuel", "Ibadan", "HBSC", 89));
        strQueue.offer(new Person("Gazal", "Kano", "BSC", 67));
        strQueue.offer(new Person("Mazal", "Jano", "BSC", 67));

        for (Person person : strQueue){
            System.out.print(person.birthplace + " ");
        }
        System.out.println();

    }

    static void setupQueue(Queue<Integer> intList){
        int i = 0;
        while (i != 10){
            intList.offer(i+1);
            i += 1;
        }
    }
}
