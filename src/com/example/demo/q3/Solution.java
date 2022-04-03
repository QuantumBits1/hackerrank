package com.example.demo.q3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Consumer;

public class Solution {
    //q3
    //sort an array of strings in lexicographic order using Stream API


    public static void main(String args[]) {
        answer();
    }

    public static void answer() {
        String[] data = {
                "abcd", "bcfk", "def", "jklmn", "jprst",
                "afc", "ambn", "kmk", "qrbd", "jus"
        };

        Consumer<String> consumer = System.out::println;
        Arrays.stream(data).sorted().forEach(consumer);
        System.out.println("-----------------------------------");
        Comparator<String> comparator = Comparator.reverseOrder();
        Arrays.stream(data).sorted(comparator).forEach(consumer);
    }
}
