package com.codedifferently.collections.set;

import com.codedifferently.collections.interfaces.Set;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SortedSetTest {

    private static Set sortedName;
    private static Set sortedId;

    @Before
    public void setUp() throws Exception {
        sortedName = new SortedSet(128);

        sortedName.add("Sam");
        sortedName.add("Victor");
        sortedName.add("Alberto");

        sortedId = new SortedSet(128);

        sortedId.add(20);
        sortedId.add(30);
        sortedId.add(40);

    }

    @Test
    public void sizeTest() throws Exception{
        int sizeBeforeAdd = sortedId.size();
        sortedId.add(50);
        int sizeAfterAdd = sortedId.size();

        Assert.assertNotEquals(sizeBeforeAdd, sizeAfterAdd);
    }

    @Test
    public void addObjectTest() throws Exception{
        int sizeBeforeAdd = sortedId.size();
        sortedId.add(60);
        int sizeAfterAdd = sortedId.size();

        Assert.assertNotEquals(sizeBeforeAdd,sizeAfterAdd);
    }
    @Test
    public void addDuplicateValueTest() throws Exception{
        int sizeBeforeAdd = sortedName.size();
        sortedName.add("Sam");
        int sizeAfterAdd = sortedName.size();

        Assert.assertEquals(sizeBeforeAdd,sizeAfterAdd);
    }

    @Test
    public void remove() {
       sortedId.remove(40);
        Assert.assertFalse(sortedId.contains(40));
    }

     @Test
    public void contains(){
        Assert.assertTrue(sortedName.contains("Victor"));
    }
}