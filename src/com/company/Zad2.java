package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Zad2 {

    static List<Integer> getSortedList(List<Integer>numbers){
        Collections.sort(numbers);                               // klasa Collections posiada gotową metodę sort
        return numbers;
    }

    public static void main(String[] args) {

        List<Integer> newList = new ArrayList<>();
        newList.addAll(CollectionInit.intArrayListRead(newList));
        System.out.println("Lista po sortowaniu: "+getSortedList(newList));
    }
}
