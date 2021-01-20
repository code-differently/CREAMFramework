package com.codedifferently.collections.linkedlist;

public class ALinkedList {
    LinkNode head; //this is the first element in our Linked List

    public static ALinkedList insert(ALinkedList list, Integer data) {
        LinkNode node = new LinkNode(data); //Create a new node
        node.nextNode = null; //Set the next node to null

        if(list.head == null) list.head = node; //if we have no head(its null)then we set our new node as the head.
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

        if(currentNode != null && currentNode.data == key) {
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

    public static void printWerthList(ALinkedList list) {
        LinkNode currentNode = list.head;
        while(currentNode != null) {
            System.out.println(currentNode.data + " ");
            currentNode = currentNode.nextNode;
        }

    }
}
