package com.codedifferently.collections.set;

import com.codedifferently.collections.Collection;
import com.codedifferently.collections.interfaces.Set;

import java.util.ArrayList;

public class SortedSet<E> extends Collection implements Set {

    private ArrayList<E> list;
    private int size;
    private Object E;

    public SortedSet(){
        list = new ArrayList<>();
        size = 0;
        this.E = "";
    }
    public int size(){
        return 0;
    }

    public ArrayList<E> getList() {
        return list;
    }

    public Object add(){
        list.add(0,(E)"Thing");
        list.add(1,(E)"Any string will do");
        list.add(2, (E)"Another one");
        return null;
    }

    public void indexOf() {

    }

    public E remove() {
        list.remove(0);
        return null;
    }

    public int get(int index) {
        return index;
    }

    public boolean isEmpty() {
        if (list.size() == 0) {
            return true;
        } else {
            return false;
        }
    }
    public Object[] toArray(){
        return new Object[0];
    }

    public boolean contains(){
        return true;
    }


}
