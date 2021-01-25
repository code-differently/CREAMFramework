package com.codedifferently.collections.concreteClass;

import com.codedifferently.collections.Interface.List;

public class ArrayList<E> implements List<E> {



    private E[] array;

    public ArrayList() {
        this.array = (E[]) new Object[0];
    }

    @Override
    public E getElementByIndex(int index) {
if(array[index]!=null){
    return array[index];
}else {
    throw new IndexOutOfBoundsException();
}
    }

    @Override
    public boolean addElement(E element) {
//        for(int i=0;i<array.length;i++){
//
//        }
        return true;
    }

    @Override
    public E removeElement(E element) {
        return element;
    }

    @Override
    public int sizeOfList() {
        for(int i=0;i<array.length;i++){
            if(array[i]!=null){
                return array.length;
            }

        }
        throw new IndexOutOfBoundsException() ;
    }

    @Override
    public boolean containsElement(Object element) {
        for (int i=0;i<array.length;i++){
            if(array.equals(element)){
                return true;
            }else {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean isListEmpty() {
        if (array == null) {
            return true;
        }
        else {
            return false;
        }
    }
}
