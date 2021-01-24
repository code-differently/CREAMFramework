package com.codedifferently.collections;

import com.codedifferently.collections.linkedlist.LinkNode;

public interface AList <T>{
    public Boolean add(T Data);
    public Object get(T Data);
    public Object remove(T Data);
    public Integer size();
    public void clear();
    public Boolean isEmpty();
    public Boolean contains();
}
