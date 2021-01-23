package com.codedifferently.collections.concreteClass;

import com.codedifferently.collections.Interface.List;

public class ArrayList<E> implements List<E> {



    private E[] array;

    public ArrayList() {
        this.array = (E[]) new Object[0];
    }

    @Override
    public E get(E index) {
        return index;
    }

    @Override
    public boolean add(E element) {
//        for(int i=0;i<array.length;i++){
//
//        }
        return true;
    }

    @Override
    public E remove(E index) {
        return index;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean contains(Object element) {
        return true;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
