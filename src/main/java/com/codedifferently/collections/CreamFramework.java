package com.codedifferently.collections;

import com.codedifferently.collections.linkedlist.ALinkedList;

public class CreamFramework {
    public static void main(String[] args) throws Exception {

        ALinkedList<Integer> list = new ALinkedList<Integer>();

        list.add(100);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        //list.printALinkedList();
        System.out.println(list.get(3));

    }
}
