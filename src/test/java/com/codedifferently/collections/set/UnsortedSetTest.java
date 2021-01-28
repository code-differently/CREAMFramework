package com.codedifferently.collections.set;

import com.codedifferently.collections.interfaces.Set;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UnsortedSetTest {

    private static Set name;
    private static Set id;

    @Before
    public  void setUp() throws Exception{
        name = new UnsortedSet(128);

        name.add("Sam");
        name.add("Victor");
        name.add("Alberto");

        id = new UnsortedSet(128);

        id.add(20);
        id.add(30);
        id.add(40);
    }

      @Test
    public void addObjectTest() throws Exception{
        int sizeBeforeAdd = name.size();
        name.add("Kenyon");
        Assert.assertTrue(name.contains("Kenyon"));
        int sizeAfterAdd = name.size();
        Assert.assertNotEquals(sizeBeforeAdd,sizeAfterAdd);
    }

    @Test
    public void addDuplicateTest() throws Exception{
        int sizeBeforeAdd = name.size();
        name.add("Sam");
        int sizeAfterAdd = name.size();
        Assert.assertEquals(sizeBeforeAdd,sizeAfterAdd);
    }

    @Test
    public void remove() throws Exception{
        name.remove("Sam");
        Assert.assertFalse(name.contains("Sam"));
    }

    @Test
    public void containsTest(){
        Assert.assertTrue(name.contains("Sam"));

    }

    @Test
    public void sizeTest() throws Exception{
        int sizeBeforeAdd = name.size();
        name.add("Corban");
        int sizeAfterAdd = name.size();

        Assert.assertNotEquals(sizeBeforeAdd,sizeAfterAdd);
    }
}