package com.codedifferently.collections.set;

import com.codedifferently.collections.interfaces.Set;


public class SortedSet extends UnsortedSet implements Set{
    private static class Entry {
        public UnsortedSet.Entry next;
        Object key;

    }
    private UnsortedSet.Entry[] sSet;

    private int size;
    public SortedSet(int capacity){
        super();
        this.sSet = new UnsortedSet.Entry[capacity];
        this.size = 0;
    }
    private int hashFunction(int hashCode){
        int index = hashCode;
        if(index < 0){
            index -= index;
        }
        return index % sSet.length;
    }
    public int size(){
       return size;
    }

    @Override
    public boolean contains(Object o) {
        int index = hashFunction(o.hashCode());
        UnsortedSet.Entry current = sSet[index];
        while(current != null){
            if(current.key.equals(o)){
                return true;
            }
            current = current.next;
        }
        return false;
    }



    public boolean add(Object o)  {
     int index = hashFunction(o.hashCode());
     UnsortedSet.Entry current = sSet[index];
     while(current != null){
         if(current.key.equals(o)){
             return false;
         }
         current = current.next;
     }
     UnsortedSet.Entry entry = new UnsortedSet.Entry();
     entry.key = o;
     entry.next = sSet[index];
     sSet[index] = entry;
     size++;
    return true;
    }

    @Override
    public boolean remove(Object o) {
      int index = hashFunction(o.hashCode());
        UnsortedSet.Entry current = sSet[index];
        UnsortedSet.Entry previous = null;

        while(current != null){
            if(current.key.equals(o)){
                if(previous == null){
                    sSet[index] = current.next;
                }else{
                    previous.next = current.next;
                }
                size--;
                return true;
            }
            previous = current;
            current = current.next;
        }
        return false;
    }




}