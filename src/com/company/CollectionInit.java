package com.company;


import java.util.*;

public class CollectionInit {
    static Scanner scanner = new Scanner(System.in);


    static List<Integer> intArrayListRead(List<Integer> numbers) {          // metoda tworzy Listę liczb podanych przez użytkownika
        System.out.println("Podaj wielkość Listy liczb całkowitych");
        int n = scanner.nextInt();
        System.out.println("Podaj elementy Listy (liczby całkowite)");
        List<Integer> userList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            userList.add(scanner.nextInt());
        }
        return userList;
    }

    static List<String> stringArrayListRead(List<String> words) {           // metoda tworzy Listę wyrazów podanych przez użytkownika
        System.out.println("Podaj wielkość Listy wyrazów");
        int n = scanner.nextInt();
        System.out.println("Podaj elementy Listy (wyrazy)");
        List<String> userList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            userList.add(scanner.next());
        }
        return userList;
    }

    static Map<String, String> dictionaryInput(Map<String, String> map) {           // metoda prosząca o uzupełnienie słownika przez użytkownika,
        Map<String, String> dictionary = new TreeMap<>();                           // wprowadzamy słowo po polsku, następnie po enterze słowo po angielsku
        System.out.println("Wprowadź słowo po polsku, po enterze tłumaczenie");     // po wpisaniu "end /enter "input" - zakończymy dodawanie słów

        String polWord;
        String foreignWord;
        do {
            polWord = scanner.next().toLowerCase();
            foreignWord = scanner.next().toLowerCase();
            dictionary.put(polWord, foreignWord);
        } while (!polWord.equalsIgnoreCase("end"));
        dictionary.remove("end");
        return dictionary;
    }
}
