package com.codedifferently.collections.sortedset;

import com.codedifferently.collections.sortedset.exceptions.DuplicateDataInSetException;
import com.codedifferently.collections.sortedset.exceptions.ObjectNotInSetException;

import java.util.logging.Logger;

public class ASortedSet <T>{
    Logger logger = Logger.getGlobal();
    private Integer position;
    private T data;

    // implement a container.. //// TODO: 1/23/21 contain multiple data objects
    // { data, data, data, data }

    public Boolean add(T data) {
//        try {
//            SetData<T> passedInData = new SetData<>(data);
//            // check if the data is already in our SET
//            // add data to the container
//            for(SetData current : container) {
//                if(data == current.getData()) throw new DuplicateDataInSetException();
//                else {
//                    //add the passedInData to container.
//                }
//            }
//        } catch (DuplicateDataInSetException e) {
//            logger.info(e + " Data Already Exists In Set");
//        }
        return null;
    }

    public Boolean contains(Object data) {
        return null;
    }

    public Boolean equals() { //// TODO: 1/23/21 how to implement
        return equals();
    }

    public Object remove(Object data) {
////        try {
////            //loop through set
////            //ask is the current element == data
////            if() {
////
////            }
////            else throw ObjectNotInSetException;
////        } catch (ObjectNotInSetException e) {
////            logger.warning(e + " Data Not In Set");
//        }
        return null;
    }

    public Integer size() {
        //int
        //loop keep track of count
        return 0;
    }

    public Object[] toArray() {
        return new Object[0];
    }

    public Boolean isEmpty() {
//        if(list.size == 0) return true;
          return false;
    }


}
