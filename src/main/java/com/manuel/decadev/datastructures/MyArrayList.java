package com.manuel.decadev.datastructures;

import java.util.ArrayList;
import java.util.Iterator;

public class MyArrayList<E> implements CustomArrayList<E>{

    public static final int INITIAL_CAPACITY = 16;
    private  E [] data = (E[]) new Object[INITIAL_CAPACITY];
    private int size = 0;

   public MyArrayList(){}

    public MyArrayList(E [] objects){
       for (int i = 0; i < objects.length; i++){
           add(objects[i]);
       }
    }


    @Override
    public void add(int index, E e) {
    // check if index is a negative num or bigger the size of te container
        if (index < 0 || index > size){
            throw  new IndexOutOfBoundsException("Index"+ index +"size"+ size);

        }
        ensureCapacity();

        for (int i = size - 1; i >= index; i--){
            data[i + 1] = data[i]; // the last at index i is shifted
        }
        data[index] = e;
        size ++;
    }

    private void ensureCapacity() {
        if (size >= data.length){
            E[] newData = (E[]) new Object[size * 2+ 1];
            System.arraycopy(data,0, newData,0, size);
            data = newData;
        }
    }

    @Override
    public E get(int index) {

       checkIndex(index);
        return data[index];

    }

    private void checkIndex(int index) {
        // check if the index is valid before attempting retrieve the element
        if (index > size || index < 0){
            throw new IndexOutOfBoundsException("Index"+ index +"invalid");
        }
    }


    @Override
    public int indexOf(E e) {
       // circle through the elements for a match and retain the index where there is a match
        for (int i = 0; i < size; i++){
        if (e.equals(data[i]))
            return i;
        }
        return -1;
    }

    @Override
    public int lastIndex(E e) {
       for (int i = size - 1; i >= 0; i-- ){
           if (e.equals(data[i])){
               return i;
           }
       }
        return -1;
    }

    @Override
    public E remove(int index) {
    checkIndex(index);
    E e = data[index];
    for (int j = index; j < size-1; j++){
       data[size - 1] = data[j+1];
    }
    size--;
        return e;
    }

    @Override
    public E set(int index, E e) {
       checkIndex(index);
       E old = data[index];
      data[index] = e;

        return old;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains(Object e) {
       for (int i = 0; i < size; i++){
           // check to see if the element in a particular index is same with the incoming index
           if (e.equals(data[i])){
               return true;
           }
       }
        return false;
    }

//    @Override
//    public Iterator<E> iterator() {
//        return null;
//    }

    @Override
    public void clear() {
       // create new empty 16 space and point the reference to the data variable
       // reset the size to 0 too
    data = (E[]) new Object[INITIAL_CAPACITY];
    size = 0;
    }

    @Override
    public String toString(){
       StringBuilder result = new StringBuilder("[");
       for (int i = 0; i < size; i++){
           result.append(data[i]);
           if (i < size - 1)
                result.append(", ");
       }
        return result.toString() + "]";
    }

    public void trimToSize(){
       if (size != data.length){
           E [] newData = (E[]) (new Object[size]);
           System.arraycopy(data, 0, newData, 0, size);
           data = newData;
       }
    }

    @Override
    public java.util.Iterator<E> iterator(){
        return new ArrayListIterator();
    }

    private class ArrayListIterator implements  java.util.Iterator<E> {
       private int current = 0;
       @Override
        public boolean hasNext(){
           return current < size;
       }

       @Override
        public E next(){
           return data[current++];
       }

       @Override
        public void remove(){
           if (current == 0){
               throw new IllegalStateException();
           }
           MyArrayList.this.remove(--current);
       }

    }
    

}
