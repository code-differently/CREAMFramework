package com.codedifferently.collections.set;

import com.codedifferently.collections.interfaces.Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;


public class UnsortedSet<E> implements Set<E> {

    private HashSet<String> uSet;
    private HashSet<Integer> uSet2;
    private int size;

    //List<Integer> listNumbers = Arrays.asList(56,100,48,23,87);

    public UnsortedSet() {
        size = 5;
        uSet = new HashSet<String>();
        uSet2 = new HashSet<Integer>();
    }

    public E Set(E input) {
        return null;
    }


    @Override
    public boolean add(E e) {
        uSet.add("Sam");
        uSet.add("Victor");
        uSet.add("Alberto");
        return false;
    }

    public boolean addInteger(E e){
        uSet2.add(567);
        uSet2.add(689);
        uSet2.add(1024);
        return false;
    }

    @Override
    public boolean remove(Object o) {
        uSet.remove("");
        uSet2.remove(567);
        return false;
    }


    public boolean contains() {
        if(!uSet.contains("Sam") ||!uSet.contains("Victor") || !uSet.contains("Alberto") ){
        return false;
        }else{
            return true;
        }
    }

    @Override
    public void clear() {

    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    public boolean isEmpty() {
        if(uSet.size() == 0) {
            return false;
        }else{
            return true;
        }
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public int size() {
        return 5;
    }


    public Integer get(int i) {
        return 0;
    }
}
