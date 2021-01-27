package com.codedifferently.collections.set;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UnsortedSetTest<E> {
    private static final Object E = 0;
    UnsortedSet<E> unsortedSet = new UnsortedSet();
    @Before
    public void setUp() {
    unsortedSet.contains("Sami");
    int size = 5;
    }

      @Test
    public void addTest() {
        boolean expected = false;
        boolean actual = unsortedSet.add((E) E);

        Assert.assertEquals(expected,actual);

    }

    @Test
    public void remove(){
        boolean expected = false;
        boolean actual = unsortedSet.remove(E);

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void isEmptyTest() {
        boolean expected = false;
        boolean actual = unsortedSet.isEmpty();

        Assert.assertEquals(false,actual);

    }
    @Test
    public void containsTest(){
        unsortedSet.contains("Victor");
        boolean expected = true;
        boolean actual = unsortedSet.contains();

        Assert.assertEquals(true,actual);
    }

    @Test
    public void SetTest(){
        Integer expected = unsortedSet.size() - 5;
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