package com.codedifferently.collections.Interface;

public interface List<E> {
    public E getElementByIndex(int index);
    public void addElement(int index,E element);
    public void removeElement(int index);
    public int sizeOfList();
    public boolean containsElement(E element);
    public boolean isListEmpty();

}
