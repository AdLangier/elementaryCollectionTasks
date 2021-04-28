package com.company;


import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Zad4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> dictionary = new TreeMap<>();
        dictionary.putAll(CollectionInit.dictionaryInput(dictionary));     // użycie metody utworzonej w klasie CollectionInit do uzupełniania słownika,
                                                                           //  sekwencja kończąca to "end" +enter+ "input"
        String polishWord;                                                 // przed użyciem pętli do - while należy zadeklarować zmienną użytą w warunku
        do {                                                               // użycie pętli do - while w tym przypadku powoduje że po wskazaniu tłumaczenia
            System.out.println("Podaj słówko po polsku");                  //    program nie zakończy się i zapyta o podanie kolejnego słowa do tłumaczenia
            polishWord = scanner.next().toLowerCase();
            if (dictionary.containsKey(polishWord)) {
                System.out.println("tłumaczenie: " + "\n" + dictionary.get(polishWord));
            } else {
                System.out.println("słowo nie występuje w słowniku");
            }

        } while (!polishWord.equals("chuj") && !polishWord.equals("kurwa")); // program zakończy działanie, jeśli użyjemy jednego z wulgarnych słów: "chuj" lub "kurwa" :)
        System.out.println("Koniec tych wulgaryzmów!!!");
    }
}
