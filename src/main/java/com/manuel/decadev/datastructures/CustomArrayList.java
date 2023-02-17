package com.manuel.decadev.datastructures;

import java.util.Collection;

public interface CustomArrayList <E> extends Collection <E> {

    public void add(int index, E e);
    public E get(int index);
    public int indexOf(E e);
    public int lastIndex(E e);
    E remove(int index);
    E set(int index, E e);
    @Override
    public default boolean add(E e){
        add(size(), e);
        return true;
    }

    @Override
    default boolean isEmpty(){
        if (size() ==0)
            return true;
        return false;
    }

    @Override
    public default boolean remove(Object e){
        if (indexOf((E) e) >= 0){
            remove(indexOf((E) e));
            return true;
        }
        return false;
    }

    @Override
    public default boolean containsAll(Collection<?> c){
        // unimplemented
        return true;
    }

    @Override
    public default boolean addAll(Collection<? extends E> c){
        // unimplemented
        return true;
    }

    @Override
    public default boolean removeAll(Collection<?>  c){

        // unimplemented
        return true;
    }

    @Override
    default boolean retainAll(Collection<?> c){
        // unimplemented
        return true;
    }

    @Override
    default Object[] toArray(){

        // unimplemented
        return null;
    }

    @Override
    default <T> T[] toArray(T[] array){
        // unimplemented
        return null;
    }

}
