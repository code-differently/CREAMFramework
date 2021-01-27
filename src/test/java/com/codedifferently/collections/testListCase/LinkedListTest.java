package com.codedifferently.collections.testListCase;

import com.codedifferently.collections.Interface.List;
import com.codedifferently.collections.concreteClass.ArrayList;
import com.codedifferently.collections.concreteClass.LinkedList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LinkedListTest {
    List linkedList;

    @Before
    public void setup(){

        linkedList = new LinkedList<Integer>();
    }
    @Test
    public void getElementByIndexTest(){
        String name1="Aakriti";
        String name2="Amirah";
        String name3="Linda";
        String name4="Celita";
        String name5="Lachelle";

        linkedList.addElement(0,name1);
        linkedList.addElement(1,name2);
        linkedList.addElement(2,name3);
        linkedList.addElement(3,name4);
        linkedList.addElement(4,name5);

        //when
        String  actual= (String) linkedList.getElementByIndex(0);
        String expected ="Aakriti";

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void addElementTest(){
        String name1="Aakriti";
        String name2="Amirah";
        String name3="Linda";
        String name4="Celita";
        String name5="Lachelle";

        linkedList.addElement(0,name1);
        linkedList.addElement(1,name2);
        linkedList.addElement(2,name3);
        linkedList.addElement(3,name4);
        linkedList.addElement(4,name5);

        //when
        int  actual=  linkedList.sizeOfList();
        int expected =5;

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void addElementTest2(){
//        String name1="Aakriti";
//        String name2="Amirah";
//        String name3="Linda";
//        String name4="Celita";
//        String name5="Lachelle";
//
//       linkedList.addElement(0,name1);
//        linkedList.addElement(1,name2);
//        linkedList.addElement(2,name3);
//        linkedList.addElement(3,name4);
//        linkedList.addElement(4,name5);

        //when
        int  actual=  linkedList.sizeOfList();
        int expected =0;

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void isListEmptyTest(){
        String name1="Aakriti";
        String name2="Amirah";
        String name3="Linda";
        String name4="Celita";
        String name5="Lachelle";

        linkedList.addElement(0,name1);
        linkedList.addElement(1,name2);
        linkedList.addElement(2,name3);
        linkedList.addElement(3,name4);
        linkedList.addElement(4,name5);

        //when
        boolean  actual=  linkedList.isListEmpty();
        boolean expected =false;

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void removeElementTest(){
        String name1="Aakriti";
        String name2="Amirah";
        String name3="Linda";
        String name4="Celita";
        String name5="Lachelle";

        linkedList.addElement(0,name1);
        linkedList.addElement(1,name2);
        linkedList.addElement(2,name3);
        linkedList.addElement(3,name4);
        linkedList.addElement(4,name5);

        //when
        linkedList.removeElement(0);
        int  actual=  linkedList.sizeOfList();
        int expected =4;

        //Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void containsElementTest(){
        String name1="Aakriti";
        String name2="Amirah";
        String name3="Linda";
        String name4="Celita";
        String name5="Lachelle";

        linkedList.addElement(0,name1);
        linkedList.addElement(1,name2);
        linkedList.addElement(2,name3);
        linkedList.addElement(3,name4);
        linkedList.addElement(4,name5);

        //when

        boolean  actual=  linkedList.containsElement(name2);
        boolean expected =true;

        //Then
        Assert.assertEquals(expected,actual);
    }
}
