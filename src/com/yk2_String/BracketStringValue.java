package com.yk2_String;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;

public class BracketStringValue {



        private static boolean isValidBacket (String bracketString){
            HashMap<Character, Character> brackets = new HashMap<>();
            brackets.put(')', '(');
            brackets.put('}', '}');
            brackets.put(']', '[');
            brackets.put('>', '<');

            Deque<Character> stack = new LinkedList<>();

            for (char c : bracketString.toCharArray()) {
                if (brackets.containsValue(c)) {
                    stack.push(c);
                } else if (brackets.containsKey(c)) {

                    if (stack.isEmpty() || stack.pop() != brackets.get(c))
                        return false;
                }
            }
            return stack.isEmpty();
        }
    }
