package com.codedifferently.collections.set;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SortedSetTest {

    SortedSet sortedSet = new SortedSet();
    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void size() {
        int expected = 0;
        int actual = sortedSet.size();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getList() {

    }

    @Test
    public void add() {
        boolean expected = false;
        boolean actual = sortedSet.add();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void indexOf() {
    }

    @Test
    public void remove() {
        boolean expected = false;
        boolean actual = sortedSet.remove();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void get() {
    }

    @Test
    public void isEmpty() {
        boolean expected = true;
        boolean actual = sortedSet.isEmpty();

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void toArray() {
    }

    @Test
    public void contains() {
    }
}