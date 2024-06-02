package org.example.lesson8.hm8.task1;

import java.util.HashSet;
import java.util.Set;

public class ToChars {

//    Напишите метод, принимающий на вход строку
//    и возвращающий набор уникальных символов этой строки (порядок не важен)
//Например: "hello, world!" -> {' ', 'd', 'w', h', 'e', 'l', 'o', '!', 'w', 'r'}.

    public static Set<Character> toChar(String input) {
        Set<Character> chars = new HashSet<>();

        for (char c : input.toCharArray()) {
            chars.add(c);
        }

        return chars;
    }

    public static void main(String[] args) {
        String input = "hello, world!";
        Set<Character> result = toChar(input);
        System.out.println(input + " =====> " +result);
    }
}
