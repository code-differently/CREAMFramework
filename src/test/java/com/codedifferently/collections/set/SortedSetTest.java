package com.codedifferently.collections.set;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SortedSetTest {

    private static final Object E = 0;
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
    public void add() {
        boolean expected = false;
        boolean actual = sortedSet.add(E);

        Assert.assertEquals(expected,actual);
    }
    @Test
    public void addStringTest(){
        boolean expected = false;
        boolean actual = sortedSet.addString(E);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void remove() {
        boolean expected = false;
        boolean actual = sortedSet.remove(E);

        Assert.assertEquals(expected,actual);
    }


    @Test
    public void isEmpty() {
        boolean expected = true;
        boolean actual = sortedSet.isEmpty();

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void toArray() {
        Object[] expected = {24,45};
        Object[] actual = sortedSet.toArray();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void contains() {
    }
}