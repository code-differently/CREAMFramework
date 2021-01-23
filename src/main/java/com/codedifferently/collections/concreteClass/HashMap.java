package com.codedifferently.collections.concreteClass;

import com.codedifferently.collections.Interface.Map;

public class HashMap<K,V>  implements Map<K,V> {

//    private E[] array;
    @Override
    public int size() {
//        HashMap<K,V> input=new HashMap<K,V>();
//
//        for(int i=0;i<;i++){
//            if(map[i]==null){
//                return 0;
//            }
//            return map.length;
//        }
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
