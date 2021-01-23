package com.codedifferently.collections.concreteClass;

import com.codedifferently.collections.Interface.List;

public class ArrayList<E> implements List<E> {



    private E[] array;

    public ArrayList() {
        this.array = (E[]) new Object[0];
    }

    @Override
    public E getElement(E index) {
        return index;
    }

    @Override
    public boolean addElement(E element) {
//        for(int i=0;i<array.length;i++){
//
//        }
        return true;
    }

    @Override
    public E removeElement(E index) {
        return index;
    }

    @Override
    public int sizeOfList() {
        return 0;
    }

    @Override
    public boolean containsElement(Object element) {
        return true;
    }

    @Override
    public boolean isEmptyList() {
        return false;
    }
}
