package com.epam.test.automation.java.practice14.middle;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Task6 {

    public static List<String> shouldReturnStringWithFirstLetterDigitAndLengthEqualsNumber
            (List<Integer> numbers, List<String> stringList) {

        return numbers.stream()
                .map(n -> {
                    Optional<String> string = stringList.stream()
                            .filter(s -> s.length() == n && Character.isDigit(s.charAt(0)))
                            .findAny();
                    if(string.isPresent()){
                        return string.get();
                    }else {
                        return "Not Found";
                    }
                })
                .collect(Collectors.toList());
    }
}
