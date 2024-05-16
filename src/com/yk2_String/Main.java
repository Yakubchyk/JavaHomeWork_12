package com.yk2_String;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println(isValidBracket("([{}])"));
    }

    private static boolean isValidBracket(String bracketString) {
        HashMap<Character, Character> brackets = new HashMap<>();
        brackets.put(')', '(');
        brackets.put('}', '{');
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



/*
Задача *:
Задана строка, которая может иметь внутри себя скобки. Скобкой считается
любой из следующих символов — «(«, «)», «[«, «]», «{«, «}». Проверить
сбалансированность расстановки скобок в этой строке. Набор скобок считается
сбалансированной парой, если открывающая скобка "(", "[" и "{" стоит слева от
соответствующей закрывающей скобки ")", "]" и "} ", соответственно. Строка,
содержащая пары скобок, не сбалансирована, если набор заключенных в нее
скобок не совпадает .
Например, если ввод «{[(])}», пара квадратных скобок «[]» заключает в себя
одну несбалансированную открывающую круглую скобку «(». Аналогично, пара
круглых скобок «() ", заключает в себя одну несбалансированную
закрывающую квадратную скобку "]". Таким образом, входная строка "{[(])}"
несбалансированная.
Пример
() - сбалансирована
[()] - сбалансирована
{[()]} - сбалансирована
([{{[(())]}}]) - сбалансирована
{{[]()}}}} - не сбалансирована
{[(])} - не сбалансирована
 */
