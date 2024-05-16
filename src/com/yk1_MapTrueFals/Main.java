package com.yk1_MapTrueFals;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Boolean> map = new HashMap<>();
        HashMap<String, String> map1 = new HashMap<>();
        String[] words = {"Banana", "Coca-Cola", "Banana", "Coca-Cola", "World", "Hello", "World"};

        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, true);
            } else {
                map.put(word, false);
            }
        }
        System.out.println(map);


        for (String word : words) {
            if (!word.isEmpty()) {
                map1.put(word.substring(0, 1), word.substring(word.length() - 1));
            }

        }
        System.out.println(map1);
    }
}


/*
Задача 1:
На вход поступает массив строк, верните Map<String, Boolean>, где каждая отдельная
строка является ключом, и ее значение равно true, если эта строка встречается в массиве
2 или более раз.
 */

/*
2:
На вход поступает массив непустых строк, создайте и верните Map<String,
String> следующим образом: для каждой строки добавьте ее первый символ в
качестве ключа с последним символом в качестве значения.
 */