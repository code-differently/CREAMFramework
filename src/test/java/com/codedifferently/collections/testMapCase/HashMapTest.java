package com.codedifferently.collections.testMapCase;

import com.codedifferently.collections.concreteClass.HashMap;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HashMapTest {

    @Before
    public void setup() {

    }

@Test
    public void size(){
    HashMap<String,String> input =new HashMap<String,String>();
//    input.put("Aakriti","Java");
//    int expected = input.size();
//    int actual =1;
    //Then
    Assert.assertEquals(0,input.size());
}

@Test
    public  void remove(){

}
}
