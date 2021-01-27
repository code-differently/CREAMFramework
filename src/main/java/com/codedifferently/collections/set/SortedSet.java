package com.codedifferently.collections.set;
import com.codedifferently.collections.DuplicateDataException;
import com.codedifferently.collections.interfaces.Set;
import java.util.ArrayList;
import java.util.logging.Logger;


public class SortedSet<E> implements Set<E> {
    Logger logger = Logger.getGlobal();
    private ArrayList<Integer> sSet;
    private int size;


    public SortedSet(){
        this.sSet = new ArrayList<Integer>();
        this.size = 2;

        sSet.add(0, 24);
        sSet.add(1, 45);

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

    public boolean add(Object o) throws DuplicateDataException {
     try {
       if (sSet.contains(o)) throw new DuplicateDataException();
       else {
           sSet.add((Integer) o);
           size++;
       }
   }catch (DuplicateDataException e){
       logger.warning(e + " Duplicate data found");
   }
        return false;
    }

    @Override
    public boolean remove(Object o) {
        sSet.remove(24);
        return false;
    }

    public boolean isEmpty() {
        if(sSet.size() == 0){
            return true;
        } else {
            return false;
        }
    }
    public Integer[] toArray(Integer[] a){
        Integer[] newSSet = sSet.toArray(new Integer[0]);
        return a;
    }

}