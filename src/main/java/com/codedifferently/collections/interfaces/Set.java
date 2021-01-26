package com.codedifferently.collections.interfaces;

public interface Set<T> {
   T Set(T input);
   boolean add();
   boolean remove();
   boolean isEmpty();
   boolean contains();
   void indexOf();
   void clear();
   void list();
   Object[] toArray();
   int size();
   int get(int index);
}
