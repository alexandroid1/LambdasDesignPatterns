package com.globallogic;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    
    public static int totalValues (List<Integer> values,
                                   Predicate<Integer> selector) {
        return values.stream()
                .filter(selector)
                .mapToInt(e -> e)
                .sum();
    }

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println(totalValues(numbers, e->true ));
        System.out.println(totalValues(numbers, Util::isEven ));
        System.out.println(totalValues(numbers, Util::isOdd ));
    }
}

// https://www.youtube.com/watch?v=e4MT_OguDKg
class Util {
    public static boolean isEven(int number){
        return number % 2 == 0;
    }

    public static boolean isOdd(int number){
        return number % 2 == 0;
    }
}
