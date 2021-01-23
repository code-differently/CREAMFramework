package com.codedifferently.collections.Interface;

public interface List<E> {
    public E get(E index);
    public boolean add(E element);
    public E remove(E index);
    public int size();
    public boolean contains(Object element);
    public boolean isEmpty();

}
