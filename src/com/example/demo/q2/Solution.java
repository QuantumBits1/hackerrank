package com.example.demo.q2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Solution {

    public static void main(String args[]) {
        //q1
        //Determine string names that start with letter j
        answer();
    }

    public static void answer() {
        //get user input name
        //proccess the stream to get name starts with 'j'
        //print the result
        List<String> names = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        String name;

        while(true) {
            System.out.println("enter a name: ");
            name = scan.nextLine();

            if(name.equals("")) break;
            names.add(name);
        }

        List<String> filteredNames = names.stream().filter(s -> s.toLowerCase().startsWith("j")).collect(Collectors.toList());
        System.out.println(filteredNames);
    }
}
