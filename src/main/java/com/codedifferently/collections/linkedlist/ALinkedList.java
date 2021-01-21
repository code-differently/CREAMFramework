package com.codedifferently.collections.linkedlist;

import com.codedifferently.collections.linkedlist.exceptions.ListHasNoElementsException;

import java.util.logging.Logger;

public class ALinkedList {
    static Logger logger = Logger.getGlobal();
    LinkNode head; //this is the first element in our Linked List

    public static <T> ALinkedList insert(ALinkedList list, T data) {
        LinkNode node = new LinkNode(data); //Create a new node
        node.nextNode = null; //Set the next node to null

        if(list.head == null) {
            list.head = node; //if we have no head(its null)then we set our new node as the head.
        }
        else {
            LinkNode last = list.head; //set our last element to the head.. traverse the list to get to the end...insert as the last element.
            while(last.nextNode != null) {
                last = last.nextNode;
            }

            last.nextNode = node;
        }
        return list;
    }

    public static ALinkedList deleteNode(ALinkedList list, Integer key) {
        LinkNode currentNode = list.head;
        LinkNode previousNode = null;

        if(currentNode != null && currentNode.data.equals(key)) {
            list.head = currentNode.nextNode;
            System.out.println(key + " has been deleted.");
            return list;
        }

        while (currentNode != null && currentNode.data != key) {
            previousNode = currentNode;
            currentNode = currentNode.nextNode;
        }

        if(currentNode != null) {
            previousNode.nextNode = currentNode.nextNode;
            System.out.println(key + " has been deleted.");
        }
        else System.out.println(key + " not found.");

        return list;
    }

    public static Integer countNodes(LinkNode head) {
        if(head == null) return null;

        LinkNode currentNode = head;
        Integer count = 1;

        while(currentNode.nextNode != null) {
            currentNode = currentNode.nextNode;
            count++;
        }
        System.out.println("Length: " + count);
        return count;
    }

    public static void printALinkedList(ALinkedList list) {
        LinkNode currentNode = list.head;
        while(currentNode != null) {
            System.out.println(currentNode.data + " ");
            currentNode = currentNode.nextNode;
        }

    }

    public static LinkNode getLastNode(ALinkedList list) throws ListHasNoElementsException{
        try {
            if(list.head == null) throw new ListHasNoElementsException();
            LinkNode current = list.head;
            while (true) {
                if (current.nextNode == null) return current;
                current = current.nextNode;
            }
        } catch (ListHasNoElementsException e) {
            logger.info("List Has No Head.");
        }
        return null;
    }

    public LinkNode getHead() {
        return head;
    }


}
