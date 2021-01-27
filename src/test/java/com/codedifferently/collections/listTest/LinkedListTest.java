package com.codedifferently.collections.listTest;

import com.codedifferently.collections.list.ArrayList;
import com.codedifferently.collections.list.LinkedList;
import org.junit.Assert;
import org.junit.Test;

import java.sql.SQLOutput;

public class LinkedListTest {

@Test
    public void currentNodeTest(){
    LinkedList linkedList = new LinkedList( "Tim", null);
    String expected = "Tim";
    String actual = linkedList.currentNode();

    Assert.assertEquals(expected, actual);
    }

@Test
    public void addNode(){
    LinkedList linky = new LinkedList("Tim", null);
    LinkedList linked = new LinkedList("Paul", linky);
    String expected = "Paul Tim";
    String actual = linked.currentNode();
}

}