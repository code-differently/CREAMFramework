package com.codedifferently.collections.set;
import com.codedifferently.collections.interfaces.Set;
import java.util.TreeSet;

public class SortedSet<Integer> implements Set<Integer> {


    private TreeSet<Integer> sSet;
    private int size;

    public SortedSet(){
        sSet = new TreeSet<Integer>();
        size = 0;


    }
    public int size(){
        return 0;
    }

    public TreeSet<Integer> getList() {
        return sSet;
    }

    @Override
    public Integer Set(Integer input) {
        return null;
    }

    public boolean add(){
        return false;
    }

    @Override
    public boolean contains() {
        return false;
    }


    public void indexOf() {

    }

    public boolean remove() {
        sSet.remove("Thing");
        return false;
    }

    public int get(int index) {
        return index;
    }

    @Override
    public void list() {

    }

    public boolean isEmpty() {
        if (sSet.size() == 0) {
            return true;
        } else {
            return false;
        }
    }
    public Object[] toArray(){
        return new Object[0];
    }


    public void clear(){

    }

}
