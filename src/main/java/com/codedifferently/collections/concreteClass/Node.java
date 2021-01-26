package com.codedifferently.collections.concreteClass;

public class Node {
    //Data carried by this node could be of any type
    Node nextNode;
    Object data;

    public Node(Object data) {
        this.data = data;
    }

    public Node(Node nextNode, Object data) {
        this.nextNode = nextNode;
        this.data = data;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
