package com.codedifferently.collections.set;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UnsortedSetTest<E> {
    UnsortedSet<E> unsortedSet = new UnsortedSet();
    @Before
    public void setUp() {

    }

    @Test
    public void add() {

    }

    @Test
    public void isEmpty() {
        boolean expected = false;
        boolean actual = unsortedSet.isEmpty();

        Assert.assertEquals(false,actual);

    }
}