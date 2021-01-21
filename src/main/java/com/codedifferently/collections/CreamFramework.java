package com.codedifferently.collections;

import com.codedifferently.collections.linkedlist.ALinkedList;
import com.codedifferently.collections.linkedlist.exceptions.ListHasNoElementsException;

public class CreamFramework {
    public static void main(String[] args) throws ListHasNoElementsException {

        ALinkedList list = new ALinkedList();

        list = ALinkedList.insert(list, 1);
        list = ALinkedList.insert(list, 2);
        list = ALinkedList.insert(list, 3);
        list = ALinkedList.insert(list, 4);
        list = ALinkedList.insert(list, null);
        list = ALinkedList.insert(list, "Thing");

        ALinkedList.countNodes(list.getHead());

        ALinkedList.printALinkedList(list);

        System.out.println(ALinkedList.getLastNode(list).toString());


    }
}
