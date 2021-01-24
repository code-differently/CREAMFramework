package com.codedifferently.collections.linkedlist;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ALinkedListTest {

    ALinkedList<Integer> listInt;
    ALinkedList<String> listStr;

    @Before
    public void setUp() {
        listInt = new ALinkedList<>();
        listStr = new ALinkedList<>();
    }

    @Test
    public void addNodeWhenNoNodesArePresent() {
        listInt.add(10);
        Integer actual = (Integer) listInt.get(10);
        Integer expected = 10;
        System.out.println(actual);

        Assert.assertEquals("Tests add() & get() with <Integer>", expected, actual);
    }

    @Test
    public void addNodeWhenMultipleNodesArePresent() {
        listInt.add(10);
        listInt.add(20);
        Integer actual = (Integer) listInt.get(20);
        Integer expected = 20;
        System.out.println(actual);

        Assert.assertEquals("Test add() & get() with <Integer>", expected, actual);
    }

    @Test
    public void getNodeInTheMiddleOfAList() {
        listStr.add("Hello");
        listStr.add("Tariq");
        listStr.add("Is");
        listStr.add("This");
        listStr.add("Not A Beautiful");
        listStr.add("Unit Test?");

        String actual = (String) listStr.get("This");
        String expected = "This";
        System.out.println(actual);

        Assert.assertEquals("Test get() with multiple nodes <String>", expected, actual);
    }

    @Test
    public void removeHeadNodeNextElementShouldBecomeHead() {
        listStr.add("Hello");
        listStr.add("Tariq");

        listStr.remove("Hello");

        String actual = listStr.getHeadNode().getData();
        String expected = "Tariq";
        System.out.println(actual);

        Assert.assertEquals("Test remove(head) with multiple nodes <String>", expected, actual);
    }

    @Test
    public void removeHeadNoOtherElements() {
        listStr.add("Tariq");

        listStr.remove("Tariq");

        LinkNode<String> actual = listStr.getHeadNode();
        LinkNode<String> expected = null;
        System.out.println(actual);

        Assert.assertEquals("Test remove(head) No Other Nodes<String>", expected, actual);
    }

    @Test
    public void removeElementInMiddleOfList() {
        listStr.add("Is");
        listStr.add("This");
        listStr.add("Not A Beautiful");
        listStr.add("Unit Test?");
        listStr.add("Hello");
        listStr.add("Tariq");
        listStr.add("I");
        listStr.add("Said");
        listStr.add("Good DAY");
        listStr.add("Sir");

        listStr.remove("Hello");

        String actual = (String) listStr.get("Tariq");
        String expected = "Tariq";
        System.out.println(actual);

        Assert.assertEquals("Test remove(element) with many nodes <String>", expected, actual);
    }

    @Test
    public void getTheSizeOfOurList() {
        //total of 10 elements
        listStr.add("Is");
        listStr.add("This");
        listStr.add("Not A Beautiful");
        listStr.add("Unit Test?");
        listStr.add("Hello");
        listStr.add("Tariq");
        listStr.add("I");
        listStr.add("Said");
        listStr.add("Good DAY");
        listStr.add("Sir");

        //remove 1 element
        listStr.remove("Hello");

        Integer actual = listStr.size();
        Integer expected = 9;
        System.out.println(actual);

        Assert.assertEquals("Test size() with many nodes <String>", expected, actual);
    }

    @Test
    public void getLastNode() {
        listStr.add("Is");
        listStr.add("This");
        listStr.add("Not A Beautiful");
        listStr.add("Unit Test?");
        listStr.add("Hello");
        listStr.add("Tariq");
        listStr.add("I");
        listStr.add("Said");
        listStr.add("Good DAY");
        listStr.add("Sir");

        String actual = listStr.getLast().getData();
        String expected = "Sir";
        System.out.println(actual);

        Assert.assertEquals("Test getLastNode() with many nodes <String>", expected, actual);
    }

    @Test
    public void getLastNodeNoNodesPresentEXCEPTION() {
        LinkNode<String> actual = listStr.getLast();
        String expected = null;
        System.out.println(actual);

        Assert.assertEquals("Test getLastNode() No Nodes <String>", expected, actual);
    }

    @Test
    public void getRandomNodeNoNodesPresentEXCEPTION() {
        String actual = (String) listStr.get("Cake");
        String expected = null;
        System.out.println(actual);

        Assert.assertEquals("Test get(element) No Nodes <String>", expected, actual);
    }

    @Test
    public void clearMultipleNodes() {
        listStr.add("Is");
        listStr.add("This");
        listStr.add("Not A Beautiful");
        listStr.add("Unit Test?");
        listStr.add("Hello");
        listStr.add("Tariq");

        listStr.clear();

        Object expected = null;
        Object actual = listStr.get("Hello");
        System.out.println(actual);

        Assert.assertEquals("Test clear() Multiple Nodes <String>", expected, actual);
    }


    @Test
    public void testIsEmptyWhenEmpty() {
        listStr.clear();

        Boolean expected = true;
        Boolean actual = listStr.isEmpty();
        System.out.println(actual);

        Assert.assertEquals("Test isEmpty()", expected, actual);
    }

    @Test
    public void testIsEmptyWhenNodesArePresent() {
        listStr.add("Unit Test?");
        listStr.add("Hello");
        listStr.add("Tariq");

        Boolean expected = false;
        Boolean actual = listStr.isEmpty();
        System.out.println(actual);

        Assert.assertEquals("Test isEmpty()", expected, actual);
    }

    @Test
    public void doesListContainAValueTrue() {
        listStr.add("Is");
        listStr.add("This");
        listStr.add("Not A Beautiful");
        listStr.add("Unit Test?");
        listStr.add("Hello");
        listStr.add("Tariq");

        Boolean expected = true;
        Boolean actual = listStr.contains("Hello");
        System.out.println(actual);

        Assert.assertEquals("Test clear() Multiple Nodes <String>", expected, actual);
    }

    @Test
    public void doesListContainAValueFalse() {
        listStr.add("Is");
        listStr.add("This");
        listStr.add("Not A Beautiful");
        listStr.add("Unit Test?");
        listStr.add("Hello");
        listStr.add("Tariq");

        Boolean expected = false;
        Boolean actual = listStr.contains("wutang");
        System.out.println(actual);

        Assert.assertEquals("Test clear() Multiple Nodes <String>", expected, actual);
    }

}