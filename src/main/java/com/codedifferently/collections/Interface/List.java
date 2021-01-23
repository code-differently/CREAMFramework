package com.codedifferently.collections.Interface;

public interface List<E> {
    public E getElement(E index);
    public boolean addElement(E element);
    public E removeElement(E index);
    public int sizeOfList();
    public boolean containsElement(Object element);
    public boolean isListEmpty();

}
