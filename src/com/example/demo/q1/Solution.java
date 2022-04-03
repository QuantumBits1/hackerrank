package com.example.demo.q1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {
    private static final ArrayList<Integer> numbers = new ArrayList<>();

    public static ArrayList<Integer> getNumbers() { return numbers; }

    public static void answers1() {
        Random rand = new Random();

        for (int i=0; i<10; i++) {
            int num = rand.nextInt() % 100;
            getNumbers().add(num);
        }
        System.out.println(numbers);

        Stream<Integer> stream = numbers.stream();
        //declare a reference to the Predicate and will be passed to filter() method
        Predicate<Integer> predicate = (n) -> (n%2) == 0;
        Stream<Integer> filteredStream = stream.filter(predicate);

        System.out.println(filteredStream.collect(Collectors.toList()));
    }

    public static void answers2() {
        Random rand = new Random();

        for (int i=0; i<10; i++) {
            int num = rand.nextInt() % 100;
            getNumbers().add(num);
        }
        System.out.println(numbers);

        //shortcut approach
        List<Integer> evenNumbers = numbers.stream().filter(n-> n%2==0).collect(Collectors.toList());
        System.out.println(evenNumbers);
    }
}
