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
    public void get(){
    ArrayList<Integer> arrayList = new ArrayList<Integer>();
    //Given
    int num=2;

    arrayList.add(num);
    //when
    int expected = (int) arrayList.get(num);
    int actual =2;
    //Then
    Assert.assertEquals(expected,actual);

}

    @Test
    public void add(){

        //Given
        int num=3;

        arrayList.add(num);
        //when
        boolean  actual=  arrayList.contains(num);
        boolean expected =true;
        //Then
        Assert.assertEquals(expected,actual);

    }

    @Test
    public void remove(){

        //Given
        int num=3;

        arrayList.add(num);

        //when
        boolean  actual=  arrayList.contains(num);;
        boolean expected =true;
        //Then
        Assert.assertEquals(expected,actual);

    }


}
