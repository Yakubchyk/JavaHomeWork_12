package com.yk1_MapTrueFals;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Boolean> map = new HashMap<>();
        String[] words1 = {"ABC", "Film", "String", "ABC", "String"};
        String[] words2 = {"Banana", "Coca-Cola", "Banana", "Coca-Cola", "World", "Hello"};

        for (String word : words2) {
            if (map.containsKey(word)) {
                map.put(word, true);
            } else {
                map.put(word, false);
            }
        }
        System.out.println(map);
    }
}
