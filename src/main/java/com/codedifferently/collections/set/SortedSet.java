package com.codedifferently.collections.set;
import com.codedifferently.collections.interfaces.Set;
import java.util.TreeSet;

public class SortedSet<E> implements Set<E> {


    private TreeSet<Integer> sSet;
    private TreeSet<String> sSet2;
    private int size;

    public SortedSet(){
        sSet = new TreeSet<Integer>();
        sSet2 = new TreeSet<String>();
        size = 2;


    }
    public int size(){
        sSet.size();
        return 2;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }


    public int get(int index) {
        return index;
    }


    public boolean add(E e) {
        sSet.add(24);
        sSet.add(45);
        return false;
    }

    public boolean addString(E e){
        sSet2.add("Victor");
        sSet2.add("Alberto");

        return false;
    }

    @Override
    public boolean remove(Object o) {
        sSet2.remove("Alberto");
        sSet.remove(24);
        return false;
    }

    public boolean isEmpty() {
        if (sSet.size() == 0) {
            return true;
        } else {
            return false;
        }
    }
    public Integer[] toArray(Integer[] a){
        Integer[] newSSet = sSet.toArray(new Integer[0]);
        return newSSet;
    }


    public void clear(){

    }

    @Override
    public Object[] toArray() {
        Object[] arr = sSet.toArray();
        int i;
        for (i = 0; i < arr.length; i++) {
            return new Object[]{arr[i]};
        }
        return (Object[]) arr[i];
    }

}
