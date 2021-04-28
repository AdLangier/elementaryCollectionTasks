package com.company;

import java.util.*;

public class Zad3 {
    public static void main(String[] args) {

        //1 sposób, z wykorzystaniem Mapy, drugi opisany w książce

        Map<Integer, Integer> numbers = new TreeMap<>();       // wykorzystujemy mapę <Key- to będzie nasza liczba, Value - to ilość wystąpień>
                                                               // a TreeMap używamy, żeby wyświetlać winik odrazu posortowany
        List<Integer> list = new ArrayList<>();                // wprowadzamy nasze dane jako listę korzystając z wcześniejszej metody
        list.addAll(CollectionInit.intArrayListRead(list));

        int number;                                            // zmienna pomocnicza "number"
        int index = 0;                                         // zmienna pomocnicza "index" służy do wywoływania w pętli kolejnych elementów listy użytkownika
        for (int i = 0; i < list.size(); i++) {
            number = list.get(index);                          // pod zmienną pomocnicza "number" podstawiamy kolejno elementy z listy
            if (numbers.containsKey(number)) {                 //     następnie umieszczamy je jako Key w mapie, instrukcja "if"
                numbers.put(number, numbers.get(number) + 1);  //     sprawdza czy podany Key jest już w mapie, jeśli tak dodaje do jego Value +1
            } else {                                           //     w przeciwnym wypadku wprowadza jako nową parę elementów do mapy
                numbers.put(number, 1);
            }
            index++;                                           // po każdym obrocie pętli "index" musi być zwiększony o 1, żeby wywołać następny element listy
        }
        for (Map.Entry<Integer, Integer> pair : numbers.entrySet()) {     // !!!!!SKŁADNIA PĘTLI FOREACH RÓŻNI SIĘ W PRZYPADKU MAP!!!!!!!!!!!
            if (pair.getValue() == 1) {
                System.out.println(pair.getKey() + " występuje tylko raz");
            } else {
                System.out.println(pair.getKey() + " występuje " + pair.getValue() + " razy");
            }
        }
    }
}
