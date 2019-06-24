package com.zipcodewilmington.looplabs;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {
    Integer[] intArray;

    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
        this.intArray=intArray;
    }

    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        List<Integer> al=new ArrayList<>();
        int count=0;
        for(Integer i:intArray){
            count = 0;
            for(Integer j:intArray){
                if(i==j)
                    count++;
            }
            if(count<maxNumberOfDuplications){
                al.add(i);
            }}Integer [] array11=  al.toArray(new Integer[al.size()]);
        return array11;
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        List<Integer> al=new ArrayList<>();
        int count=0;
        for(Integer i:intArray){
            count = 0;
            for(Integer j:intArray){
                if(i==j)
                    count++;
            }
            if(count!=exactNumberOfDuplications){
                    al.add(i);
            }}
        Integer [] array1=  al.toArray(new Integer[al.size()]);
        return array1;

    }
}
