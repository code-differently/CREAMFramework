package com.codedifferently.collections.set;

import com.codedifferently.collections.interfaces.Set;


public class UnsortedSet implements Set {

    public UnsortedSet() {

    }

    public static class Entry {
        public Entry next;
        Object key;

    }
    private Entry[] uSet;

    private int size;

    public UnsortedSet(int capacity) {
        this.size = 0;
        this.uSet = new Entry[capacity];

    }

    private int hashFunction(int hashCode){
        int index = hashCode;
        if(index < 0){
            index -= index;
        }
        return index % uSet.length;
    }

    @Override
    public boolean add(Object o) {
        int index = hashFunction(o.hashCode());
        Entry current = uSet[index];
        while (current != null) { // if Object is already in set
              if (current.key.equals(o)) {
                return false;
            }
              current = current.next; // otherwise visit next entry in the uSet
        }
        Entry entry = new Entry();
        entry.key = o; //if uSet is empty current entry is null otherwise it goes to next entry
        entry.next = uSet[index];
        uSet[index] = entry;
        size++;
       return true;
    }

    @Override
    public boolean remove(Object o) {
        int index = hashFunction(o.hashCode());
        Entry current = uSet[index];
        Entry previous = null;

        while(current != null){
            if(current.key.equals(o)){
                if(previous == null){
                    uSet[index] = current.next;
                }else{
                    previous.next = current.next;
                }
                size--;
                return true;
            }
            previous = current;
            current = current.next;
        }
        return false; //Since there is no object found to remove
    }

      @Override
    public boolean contains(Object o) {
        int index = hashFunction(o.hashCode());
        Entry current = uSet[index];
        while (current != null) {
            if (current.key.equals(o)) {
                return true;
            }
            current = current.next; // otherwise go to next node in the uSet
        }
        return false;   // if no element found
    }

    @Override
    public int size() {
        return size;
    }


}
