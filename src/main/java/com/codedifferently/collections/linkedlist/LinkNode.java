package com.codedifferently.collections.linkedlist;

public class LinkNode <T>{
    T data;
    LinkNode nextNode;
    //LinkNode prevNode; //add doubly linked

    LinkNode(T data) {
        this.data = data;
        nextNode = null;
        //prevNode = null;
    }

    @Override
    public String toString() {
        return "LinkNode{" +
                "data=" + data +
                ", nextNode=" + nextNode +
                '}';
    }
}
