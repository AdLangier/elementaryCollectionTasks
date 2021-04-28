package com.company;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CollectionInit {
    static Scanner scanner = new Scanner(System.in);


    static List<Integer> intArrayListRead(List<Integer> numbers) {
        System.out.println("Podaj wielkość Listy liczb całkowitych");
        int n = scanner.nextInt();
        System.out.println("Podaj elementy Listy (liczby całkowite)");
        List<Integer> userList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            userList.add(scanner.nextInt());
        }
        return userList;
    }

    static List<String> stringArrayListRead(List<String> words) {
        System.out.println("Podaj wielkość Listy wyrazów");
        int n = scanner.nextInt();
        System.out.println("Podaj elementy Listy (wyrazy)");
        List<String> userList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            userList.add(scanner.next());
        }
        return userList;
    }
}
