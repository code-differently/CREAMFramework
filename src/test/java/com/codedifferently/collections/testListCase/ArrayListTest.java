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

    ArrayList<Integer> arrayList = new ArrayList<Integer>();
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
}
