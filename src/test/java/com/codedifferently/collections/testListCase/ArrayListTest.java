package com.codedifferently.collections.testListCase;

import com.codedifferently.collections.Interface.List;
import com.codedifferently.collections.concreteClass.ArrayList;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ArrayListTest {
  List arrayList;
  int interl;
  Integer inte;

@Before
    public void setup(){

    arrayList = new ArrayList<Integer>();
}

@Test
//when the list is not empty
    public void getElement(){
    ArrayList<Integer> arrayList = new ArrayList<Integer>();
    //Given
    int num=2;

    arrayList.addElement(num);
    //when
    int expected = (int) arrayList.getElement(num);
    int actual =2;
    //Then
    Assert.assertEquals(expected,actual);

}

    @Test
    public void addElementTest(){

        //Given
        int num=3;

        arrayList.addElement(num);
        //when
        boolean  actual=  arrayList.containsElement(num);
        boolean expected =true;
        //Then
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void removeElementTest(){

        //Given
        int num=3;

        arrayList.removeElement(num);

        //when
        boolean  actual=  arrayList.containsElement(num);
        boolean expected =true;
        //Then
        Assert.assertEquals(expected,actual);

    }


    @Test
    public void size(){

        //Given
        int num1=3;
        int num2=4;

        arrayList.addElement(num1);
        arrayList.addElement(num2);

        //when
        int  actual=  arrayList.sizeOfList();
        int  expected =0;
        //Then
        Assert.assertEquals(expected,actual);

    }


    @Test
    public void containsElementTest(){

        //Given
        int num1=3;
        int num2=4;

        arrayList.addElement(num1);
        arrayList.addElement(num2);

        //when
        boolean  actual=  arrayList.containsElement(num1);
        boolean  expected =true;
        //Then
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void isListEmptyTest(){

        //Given
        int num1=3;
        int num2=4;

        arrayList.addElement(num1);
        arrayList.addElement(num2);

        //when
        boolean  actual=  arrayList.isListEmpty();
        boolean  expected =true;
        //Then
        Assert.assertEquals(expected,actual);

    }

}
