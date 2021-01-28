package com.codedifferently.collections.interfaces;

public interface Set<E> {

   boolean add(Object o) throws Exception;
   boolean remove(Object o);
   boolean contains(Object o);
   boolean equals(Object o);
   int size();

}