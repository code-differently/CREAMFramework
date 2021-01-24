package com.codedifferently.collections.linkedlist;

import com.codedifferently.collections.AList;
import com.codedifferently.collections.linkedlist.exceptions.ListHasNoElementsException;

import java.util.logging.Logger;

public class ALinkedList <T> implements AList {
    static Logger logger = Logger.getGlobal();
    private LinkNode head;
    //this is the first element in our Linked List

    @Override
    public Boolean add(Object data) {
        LinkNode<T> node = new LinkNode(data);                            //Create a new node
        node.setNextNode(null);                                             //Set the next node to null

        if(this.head == null) this.head = node;                             //if we have no head(its null)then we set our new node as the head.
        else {
            LinkNode last = this.head;                                      //set our last element to the head.. traverse the list to get to the end...insert as the last element.
            while(last.getNextNode() != null) {
                last = last.getNextNode();
            }
            last.setNextNode(node);
        }
        return true;
    }


    @Override
    public Object get(Object data) {                                        // Should retrieve the object being passed in - or null. If no items are present throw an exception
        try {
            if(this.head == null) throw new ListHasNoElementsException();   // If the list has no elements throw our custom exception.

            LinkNode currentNode = this.head;

            while (currentNode != null) {
                if (currentNode.getData() == data) return currentNode.getData();
                currentNode = currentNode.getNextNode();
            }

        } catch (ListHasNoElementsException e) {
            logger.warning(e + " ALinkedList Has No Values.");
        }
        return null;
    }


    @Override
    public LinkNode<T> remove(Object data) {
        LinkNode currentNode = this.head;
        LinkNode previousNode = null;

        if(currentNode != null && currentNode.getData().equals(data)) {          // If the key is the head node
            this.head = currentNode.getNextNode();
            logger.info(data + " has been deleted.");
            return currentNode;
        }

        while (currentNode != null && currentNode.getData() != data) {          // If the key is not the head node, move along searching until...
            previousNode = currentNode;
            currentNode = currentNode.getNextNode();
        }

        if(currentNode != null && previousNode != null) {
            previousNode.setNextNode(currentNode.getNextNode());
            logger.info(data + " has been deleted.");
        }
        else logger.info(data + " not found.");

        return currentNode;
    }


    public Integer size() {                                                             // Count all of our nodes.
        if(this.head == null) return null;

        LinkNode currentNode = head;
        Integer count = 1;

        while(currentNode.getNextNode() != null) {
            currentNode = currentNode.getNextNode();
            count++;
        }
        logger.info("Length: " + count);
        return count;
    }

    public void printALinkedList() {
        LinkNode currentNode = this.head;
        while(currentNode != null) {
            logger.info(currentNode.getData() + " ");
            currentNode = currentNode.getNextNode();
        }

    }

    public LinkNode<T> getLast() {
        try {
            if(this.head == null) throw new ListHasNoElementsException();
            LinkNode<T> current = this.head;

            while (true) {
                if (current.getNextNode() == null) return current;

                current = current.getNextNode();
            }
        } catch (ListHasNoElementsException e) {
            logger.info(e + " ALinkedList Has No Values.");
        }
        return null;
    }

    @Override
    public void clear() {
        this.head = null;
    }

    @Override
    public Boolean isEmpty() {
        return head == null;
    }

    @Override
    public Boolean contains(Object data) {
        try {
            if(this.head == null) throw new ListHasNoElementsException();   // If the list has no elements throw our custom exception.

            LinkNode currentNode = this.head;

            while (currentNode != null) {
                if (currentNode.getData() == data) return true;
                currentNode = currentNode.getNextNode();
            }

        } catch (ListHasNoElementsException e) {
            logger.warning(e + " ALinkedList Has No Values.");
        }
        return false;
    }

    public LinkNode<T> getHeadNode() {
        return head;
    }

}
