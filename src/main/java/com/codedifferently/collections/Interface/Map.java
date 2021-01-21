package com.codedifferently.collections.Interface;

public interface Map<K,V> {
    public V get(Object key);
    public V put(K key, V value);
    public int size();
    public boolean containsKey(Object Key);
    public boolean containsValue(Object Value);
    public boolean isEmpty();
    public V remove(Object key);

}
