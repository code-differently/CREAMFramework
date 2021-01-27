package com.codedifferently.collections.listTest;

import com.codedifferently.collections.list.ArrayList;
import com.codedifferently.collections.list.EmptyLinkedListException;
import com.codedifferently.collections.list.LinkedList;
import org.junit.Assert;
import org.junit.Test;



public class LinkedListTest {

    @Test
    public void containsTest(){
        LinkedList linked = new LinkedList();
        linked.addHead("Paul");
        Assert.assertTrue(linked.contains("Paul"));

    }

    @Test
    public void printNodeContentTest(){
        LinkedList linked = new LinkedList();
        linked.addHead("Paul");
        String expected = "Paul";
        String actual = linked.printNodeContent();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void addHeadTest(){
        LinkedList linked = new LinkedList();
        linked.addHead("Paul");
        Assert.assertTrue(linked.contains("Paul"));
    }

    @Test
    public void addTailTest() throws EmptyLinkedListException {
        LinkedList linked = new LinkedList();
        linked.addHead("Paul");
        linked.addTail("Amy");
        Assert.assertTrue(linked.contains("Amy"));

    }

    @Test
    public void DeleteHeadTest() throws EmptyLinkedListException {
        LinkedList linked = new LinkedList();
        linked.addHead("Paul");
        linked.deleteHead();
        Assert.assertFalse(linked.contains("Paul"));
    }









}