package com.codedifferently.collections.concreteClass;

import com.codedifferently.collections.Interface.List;

public class ArrayList<E> implements List<E> {

   // private E[] array;
    @Override
    public E get(E index) {
        return index;
    }

    @Override
    public boolean add(E element) {
        return false;
    }

    @Override
    public E remove(E index) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean contains(Object element) {
        return false;
    }
}
