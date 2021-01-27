package com.codedifferently.collections.interfaces;

public interface Set<E> {

   boolean add(Object o);
   boolean remove(Object o);
   boolean isEmpty();
   boolean contains(Object o);
   boolean equals(Object o);
   int size();

}