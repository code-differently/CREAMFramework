package com.codedifferently.collections.concreteClass;

import com.codedifferently.collections.Interface.List;

public class LinkedList<E> implements List <E> {

    private Node head;

    @Override
    public E getElementByIndex(int index) {
        Node currentNode = null;
        //if index is lower than 1
        if(index <0){
            return null;
        }
        if(head != null){
            currentNode=head.getNextNode();
            for(int i=0;i<index;i++){
                if(currentNode.getNextNode()==null){
                    return null;
                }
                currentNode = currentNode.getNextNode();
            }
           // return currentNode.getData();
        }
        return (E) currentNode.getData();
    }

    @Override
    public void addElement(int index, Object element) {
       // int counter =0;

        if (head == null) {
            head = new Node(element);
        }

        // inserts the specified element at the specified position in this list
        Node tempNode = new Node(element);
        Node currentNode = head;
        // Let's check for NPE before iterate over crunchifyCurrent
        if (currentNode != null) {
            // crawl to the requested index or the last element in the list, whichever comes first
            for (int i = 0; i < index && currentNode.getNextNode() != null; i++) {
                currentNode = currentNode.getNextNode();
            }
        }
        // set the new node's next-node reference to this node's next-node reference
        currentNode.setNextNode(currentNode.getNextNode());
        // now set this node's next-node reference to the new node
        currentNode.setNextNode(tempNode);
        // increment the number of elements variable
        //counter++;
    }


    @Override
    public void removeElement(int index) {
        Node currentNode = null;
        int result =0;
        int count=0;
        //if index is lower than 1
        if(index < 1 || index > sizeOfList()){
            result=0;
        }
        if(head != null){
            currentNode=head.getNextNode();
            for(int i=0;i<index;i++){
                if(currentNode.getNextNode()==null){
                    result= 0;
                }
                currentNode = currentNode.getNextNode();
            }
            currentNode.setNextNode(currentNode.getNextNode().getNextNode());
        }
        count--;
    }

    @Override
    public int sizeOfList() {
        int count = 0;

        if (head == null) {
            return 0;
        }
        Node currentNode =head;

      while(currentNode!=null){
            currentNode = currentNode.getNextNode();

            if(currentNode ==null) {

            }else {
                count++;
            }
        }
        return count;
    }


    @Override
    public boolean containsElement(Object element) {
        // step 1: head is not null
        /// step 2: currentnode = head;
        // while (currentnode != null)



        Node currentNode = head;
        while(currentNode != null){


            if(currentNode.getData().equals(element)){
                return true;
        }
            currentNode=currentNode.getNextNode();
    }
        return false;
    }

    @Override
    public boolean isListEmpty() {
        if(sizeOfList()==0 ){
            return true;
        }
        return false;
    }
}
