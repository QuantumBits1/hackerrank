package com.example.demo.q1;

import java.util.ArrayList;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {

    public static void answers() {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random rand = new Random();

        for (int i=0; i<10; i++) {
            int num = rand.nextInt() % 100;
            numbers.add(num);
        }

        System.out.println(numbers);
        Stream<Integer> stream = numbers.stream();
        //declare a reference to the Predicate and will be passed to filter() method
        Predicate<Integer> predicate = (n) -> (n%2) == 0;
        Stream<Integer> filteredStream = stream.filter(predicate);

        System.out.println(filteredStream.collect(Collectors.toList()));
    }

}
