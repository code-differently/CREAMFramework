package com.codedifferently.collections.list;

import org.w3c.dom.Node;

import javax.lang.model.element.Element;

public class LinkedList<E> {
    private Node head;


    public static class Node {
        private Node previous;
        private String data;
        private Node next;

        public Node(String data) {
            this.previous = null;
            this.data = data;
            this.next = null;
        }
    }

    public boolean contains(String value) {
        Node content = head;
        if (content == null) {
            return false;
        } else {
            return true;
        }
    }

    public String printNodeContent() {
        Node print = head;
        if (print != null) {
            System.out.println(print.data + "-->");
        }
        //System.out.println("null value");
        return print.data;
    }

    public void addHead(String value) {
        Node newNode = new Node(value);
        newNode.next = head;
        head = newNode;
        newNode.previous = null;
    }

    public void add(String value) {
        Node newNode = new Node(value);
        newNode.next = null;

    }


    public void addTail(String value) throws EmptyLinkedListException{
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            throw new EmptyLinkedListException();
        }
        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode.next = newNode;
            newNode.previous = currentNode;
        }
    }

    public Node deleteHead() throws EmptyLinkedListException {
        if (head == null) {
            throw new EmptyLinkedListException();
        }
        Node temp = head;
        head = head.next;       //makes next node the new head
        temp.next = null;       //Deletes head
        return temp;
    }

    public Node getHead() {
        return head;
    }


    public Node deleteTail() throws EmptyLinkedListException {
        if (head == null || head.next == null) {
            return head;
        }
        Node current = head;
        Node previous = null;

        while (current.next != null) {
            previous = current;         //Takes node before tail and sets it as new tail
            current = current.next;     //Moves tail to new tail's next node
        }
        previous.next = null;       //Deletes new tail's next node (old tail)
        return current;             //returns new tail


    }

    public static void main(String[] args) {
        LinkedList.Node head = new LinkedList.Node("Paul");
        LinkedList.Node two = new LinkedList.Node("Tim");
        LinkedList.Node three = new LinkedList.Node("Tommy");
        LinkedList.Node four = new LinkedList.Node("Amy");
        LinkedList.Node five = new LinkedList.Node("Brenda");

        head.next = two;
        two.next = three;
        three.next = four;
        four.next = five;

        five.previous = four;
        four.previous = three;
        three.previous = two;
        two.previous = head;

    }
}