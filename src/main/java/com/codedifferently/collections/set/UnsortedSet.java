package com.codedifferently.collections.set;

import com.codedifferently.collections.interfaces.Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;


public class UnsortedSet<T> implements Set<T> {

    private HashSet<String> uSet;
    private int size;

    List<Integer> listNumbers = Arrays.asList(56,100,48,23,87);

    public UnsortedSet() {
        size = 5;
        uSet = new HashSet<String>();
        uSet.add("Victor");
        uSet.add("Alberto");
        uSet.add("Kenyon");
        uSet.add("Corban");
        uSet.add("Sami");
    }

    public T Set(T input) {
        return null;
    }

    public boolean add() {
        return false;
   }

    @Override
    public boolean remove() {
        return false;
    }


    public boolean contains() {
        return false;
    }

    public void indexOf() {

    }

    @Override
    public void clear() {

    }


    public int get(int index) {

        return index;
    }

    @Override
    public void list() {

    }

    public boolean isEmpty() {
        if(uSet.size() == 0) {
            return false;
        }else{
            return true;
        }
    }

    public Object[] toArray(){
        return new Object[0];
    }

    @Override
    public int size() {
        return 5;
    }

}
