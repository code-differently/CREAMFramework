package com.codedifferently.collections;

import com.codedifferently.collections.linkedlist.LinkNode;

public interface AList <T>{
    public Boolean add(T data);
    public Object get(T data);
    public Object remove(T data);
    public Integer size();
    public void clear();
    public Boolean isEmpty();
    public Boolean contains(T data);
}
