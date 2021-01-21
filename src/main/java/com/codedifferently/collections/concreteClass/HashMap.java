package com.codedifferently.collections.concreteClass;

import com.codedifferently.collections.Interface.Map;

public class HashMap<K,V>  implements Map<K,V> {
    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean containsKey(Object key) {
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        return false;
    }

    @Override
    public V get(Object key) {
        return null;
    }

//    @Override
//    public V put(K key, V value) {
//        return null;
//    }

    @Override
    public V remove(Object key) {
        return null;
    }

    @Override
    public V put(K key, V value) {

        return value;
    }

    @Override
    public void clear() {

    }




}
