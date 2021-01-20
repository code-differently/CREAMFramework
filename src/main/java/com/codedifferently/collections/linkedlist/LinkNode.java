package com.codedifferently.collections.linkedlist;

public class LinkNode {
    Integer data;
    LinkNode nextNode;
    //Node prevNode; add doubly linked

    LinkNode(Integer data) {
        this.data = data;
        nextNode = null;
    }
}
