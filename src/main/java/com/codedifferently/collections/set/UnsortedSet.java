package com.codedifferently.collections.set;

import com.codedifferently.collections.interfaces.Set;

import java.util.ArrayList;


public class UnsortedSet<E> implements Set<E> {

    private ArrayList<Integer> uSet;
    private int size;


    public UnsortedSet() {
        this.size = 5;
        this.uSet = new ArrayList<Integer>();

    }

    @Override
    public boolean add(Object e) {
        uSet.add(0,567);
        uSet.add(1,689);
        uSet.add(2,1024);
       return false;
    }

    @Override
    public boolean remove(Object o) {
        uSet.remove(567);
        uSet.remove(1);
        return false;
    }


    public boolean contains() {
        if(!uSet.contains("Sam") ||!uSet.contains("Victor") || !uSet.contains("Alberto") ){
        return false;
        }else{
            return true;
        }
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
