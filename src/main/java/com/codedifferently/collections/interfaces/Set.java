package com.codedifferently.collections.interfaces;

public interface Set<E> {

   boolean add(E e);
   boolean remove(Object o);
   boolean isEmpty();
   boolean contains(Object o);
   boolean equals(Object o);
   void clear();
   Object[] toArray();
   int size();

}
