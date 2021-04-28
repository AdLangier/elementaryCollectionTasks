package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Zad1 {

    static List<Integer> getDividedByThree(List<Integer> numbers) {
        List<Integer> list = new ArrayList<>();
        for (Integer value : numbers) {                           // starać się wykorzystywać pętlę foreach przy kolekcjach
            if (value % 3 == 0) {
                list.add(value);
            }
        }
        return list;
    }

    public static void main(String[] args) {

        List<Integer> newList = new ArrayList<>();
        newList.addAll(CollectionInit.intArrayListRead(newList));    // 1. użycie utworzonej wcześniej w klasie CollectionInit metody, dającej użytkownikowi możliwość wprowadzenia własnych danych do listy
//        newList.addAll(Arrays.asList(1,2,3,6));  ------------------>  2. można utworzyć listę "na sztywno" do sprawdzania


        System.out.println("Elementy listy, podzielne przez 3 to: "+ getDividedByThree(newList));
    }


}
