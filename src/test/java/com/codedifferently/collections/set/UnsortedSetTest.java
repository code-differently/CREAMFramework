package com.codedifferently.collections.set;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UnsortedSetTest<T> {
    UnsortedSet<T> unsortedSet = new UnsortedSet();
    @Before
    public void setUp() {

    }

    @Test
    public void addTest() {

    }

    @Test
    public void isEmptyTest() {
        boolean expected = false;
        boolean actual = unsortedSet.isEmpty();

        Assert.assertEquals(false,actual);

    }
    @Test
    public void containsTest(){
        boolean expected = false;
        boolean actual = unsortedSet.contains();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void SetTest(){
        Integer expected = 56;
        Integer actual = unsortedSet.get(0);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void sizeTest(){
        int expected = 5;
        int actual = unsortedSet.size();

        Assert.assertEquals(expected,actual);
    }
}