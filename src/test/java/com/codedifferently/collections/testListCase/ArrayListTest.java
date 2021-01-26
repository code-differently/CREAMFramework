package com.codedifferently.collections.testListCase;

import com.codedifferently.collections.Interface.List;
import com.codedifferently.collections.concreteClass.ArrayList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ArrayListTest {
  List arrayList;


@Before
    public void setup(){

    arrayList = new ArrayList<Integer>();
}

@Test
//when the list is not empty
    public void getElement(){
//    ArrayList<Integer> arrayList = new ArrayList<Integer>();
    String name1="Aakriti";
    String name2="Amirah";
    String name3="Linda";
    String name4="Celita";
    String name5="Lachelle";

    arrayList.addElement(1,name1);
    arrayList.addElement(2,name2);
    arrayList.addElement(3,name3);
    arrayList.addElement(4,name4);
    arrayList.addElement(5,name5);
    //when
    String expected = "Aakriti";
    String actual = (String) arrayList.getElementByIndex(1);
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

        arrayList.addElement(1,name1);
        arrayList.addElement(2,name2);
        arrayList.addElement(3,name3);
        arrayList.addElement(4,name4);
        arrayList.addElement(5,name5);

        //when
        boolean  actual=  arrayList.containsElement(name1);
        boolean expected =true;

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

        arrayList.addElement(1,name1);
        arrayList.addElement(2,name2);
        arrayList.addElement(3,name3);
        arrayList.addElement(4,name4);
        arrayList.addElement(5,name5);

        //when
        boolean  actual=  arrayList.containsElement(name1);
        boolean expected =true;
        //Then
        Assert.assertEquals(expected,actual);

    }


    @Test
    public void size(){

        String name1="Aakriti";
        String name2="Amirah";
        String name3="Linda";
        String name4="Celita";
        String name5="Lachelle";

        arrayList.addElement(1,name1);
        arrayList.addElement(2,name2);
        arrayList.addElement(3,name3);
        arrayList.addElement(4,name4);
        arrayList.addElement(5,name5);

        //when
        int  actual=  arrayList.sizeOfList();
        int  expected =5;
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

        arrayList.addElement(1,name1);
        arrayList.addElement(2,name2);
        arrayList.addElement(3,name3);
        arrayList.addElement(4,name4);
        arrayList.addElement(5,name5);

        //when
        boolean  actual=  arrayList.containsElement(name2);
        boolean  expected =true;
        //Then
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void isListEmptyTest1(){



        //when
        boolean  actual=  arrayList.isListEmpty();
        boolean  expected =true;

        //Then
        Assert.assertEquals(expected,actual);

    }


    @Test
    public void isListEmptyTest2(){

        //Given
        String name1="Aakriti";
        String name2="Amirah";
        String name3="Linda";
        String name4="Celita";
        String name5="Lachelle";

        arrayList.addElement(1,name1);
        arrayList.addElement(2,name2);
        arrayList.addElement(3,name3);
        arrayList.addElement(4,name4);
        arrayList.addElement(5,name5);

        //when
        boolean  actual=  arrayList.isListEmpty();
        boolean  expected =false;

        //Then
        Assert.assertEquals(expected,actual);

    }

}
