package com.zipcodewilmington.looplabs;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {
    String[] intArray;
    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
        this.intArray=intArray;
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        List<String> al=new ArrayList<>();
        int count=0;
        for(String i:intArray){
            count = 0;
            for(String j:intArray){
                if(i==j)
                    count++;
            }
            if(count<maxNumberOfDuplications){
                al.add(i);
            }}String [] array11=  al.toArray(new String[al.size()]);
        return array11;
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        List<String> al=new ArrayList<>();
        int count=0;
        for(String i:intArray){
            count = 0;
            for(String j:intArray){
                if(i==j)
                    count++;
            }
            if(count!=exactNumberOfDuplications){
                al.add(i);
            }}
        String [] array1=  al.toArray(new String[al.size()]);
        return array1;

    }

}
