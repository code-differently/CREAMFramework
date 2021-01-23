package com.codedifferently.collections.linkedlist;

public class LinkNode <T>{
    private T data;
    private LinkNode<T> nextNode;
    private LinkNode<T> prevNode;

    LinkNode(T data) {
        this.data = data;
        this.nextNode = null;
        //prevNode = null;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public LinkNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(LinkNode nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return "LinkNode{" +
                "data=" + data +
                ", nextNode=" + getNextNode() +
                '}';
    }
}
