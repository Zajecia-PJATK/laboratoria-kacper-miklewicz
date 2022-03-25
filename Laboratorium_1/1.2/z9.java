package com.company;

import java.io.*;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double[] numbers = new double[3];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scan.nextDouble();
        }

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                double tmpNumber = numbers[j];
                if (j > 0 && numbers[j - 1] > numbers[j]) {
                    numbers[j] = numbers[j - 1];
                    numbers[j - 1] = tmpNumber;
                }
            }
        }

        DecimalFormat dFormatter = new DecimalFormat("0.000000");

        System.out.println(dFormatter.format(numbers[0]) + " " + dFormatter.format(numbers[1]) + " " + dFormatter.format(numbers[2]));
        System.out.println(dFormatter.format(numbers[2]) + " " + dFormatter.format(numbers[1]) + " " + dFormatter.format(numbers[0]));
    }
}
