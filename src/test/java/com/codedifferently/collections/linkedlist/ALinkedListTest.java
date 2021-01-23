package com.codedifferently.collections.linkedlist;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ALinkedListTest {

    ALinkedList<Integer> listInt;
    ALinkedList<String> listStr;

    @Before
    public void setUp() {
        listInt = new ALinkedList<Integer>();
        listStr = new ALinkedList<String>();
    }

    @Test
    public void addNodeWhenNoItemsArePresent() {
        listInt.add(10);
        Integer actual = (Integer) listInt.get(10);
        Integer expected = 10;
        System.out.println(actual);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void deleteNode() {
    }

    @Test
    public void countNodes() {
    }

    @Test
    public void printALinkedList() {
    }
}