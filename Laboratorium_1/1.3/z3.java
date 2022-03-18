package com.company;

import java.util.*;
import java.io.*;

public class Main {

    static int max_rec(ArrayList<Integer> numbers) {

        if (numbers.size() > 1) {
            if (numbers.get(0) >= numbers.get(1)) {
                numbers.remove(1);
                max_rec(numbers);
            } else if (numbers.get(0) < numbers.get(1)) {
                numbers.remove(0);
                max_rec(numbers);
            }
        }

        return numbers.get(0);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> numbersList = new ArrayList<>();

        while (scan.hasNextInt()) {
            int number = scan.nextInt();
            numbersList.add(number);
        }

        System.out.println(max_rec(numbersList));
    }
}
