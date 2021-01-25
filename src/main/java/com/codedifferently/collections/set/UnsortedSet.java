package com.codedifferently.collections.set;

import com.codedifferently.collections.Collection;
import com.codedifferently.collections.interfaces.Set;


public class UnsortedSet<E> extends Collection implements Set {




    public UnsortedSet() {
        super();
    }

//   public Set add() {
//    Set<E> s = uSet.add();
//       return s;
//   }

    public Object add() {
        return null;
    }

    public boolean contains() {

        return false;
    }

    public void indexOf() {

    }


    public int get(int index) {

        return index;
    }

    public boolean isEmpty() {
        return super.isEmpty();
    }

    public Object[] toArray(){
        return new Object[0];
    }

}
