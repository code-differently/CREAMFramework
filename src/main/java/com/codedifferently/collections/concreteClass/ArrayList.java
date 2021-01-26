package com.codedifferently.collections.concreteClass;

import com.codedifferently.collections.Interface.List;

public class ArrayList<E> implements List<E> {



    private E[] array;

    public ArrayList() {

        this.array = (E[]) new Object[9];
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
    public void addElement(int index, E element) {

            array[index]=element;

    }


    @Override
    public void removeElement(int index) {
    array[index]=null;
}



    @Override
    public int sizeOfList() {
        int count=0;
        for(int i=0;i<array.length;i++){
            if(array[i]!=null){
                count++;
            }

        }
        return count;
    }

    @Override
    public boolean containsElement(E element) {
        for (int i=0;i<array.length;i++){
            if( array[i]!=null && array[i].equals(element)){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean isListEmpty() {
        for (int i=0;i<array.length;i++) {
            if(array[i]!=null) {
                return false;
            }
        }
            return true;

    }
}
