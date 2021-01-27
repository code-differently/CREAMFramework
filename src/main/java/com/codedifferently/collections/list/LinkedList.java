package com.codedifferently.collections.list;

import org.w3c.dom.Node;

import javax.lang.model.element.Element;

public class LinkedList<E> {

    private LinkedList previous;
    private String data;
    private LinkedList next;

    public LinkedList(String data, LinkedList next) {
        this.data = data;
        this.next = next;
    }


    public String currentNode() {
        return data + "";
    }

    public String previousNode(String previous, String data) {
        return previous + "";
    }

    public String nextNode() {
        return next + "";
    }

    public LinkedList addNode(String data, LinkedList newNode) {
        LinkedList linked = new LinkedList(data, newNode);
        return linked;
    }

}