package com.codedifferently.collections.Interface;

public interface List<E> {
    public E getElementByIndex(int index);
    public boolean addElement(E element);
    public E removeElement(E element);
    public int sizeOfList();
    public boolean containsElement(Object element);
    public boolean isListEmpty();

}
