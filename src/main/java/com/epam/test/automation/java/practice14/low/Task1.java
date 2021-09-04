package com.epam.test.automation.java.practice14.low;

import java.util.List;
import java.util.stream.Collectors;

public class Task1 {

    public static List<String> filterByFirstAndLastCharacter(char symbol, List<String> stringList) {

        return stringList.stream()
                .filter(s -> s.charAt(0) == symbol && s.charAt(s.length()-1) == symbol)
                .collect(Collectors.toList());
    }
}
