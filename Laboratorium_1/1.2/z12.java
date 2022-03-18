package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        int m = scan.nextInt();
        int n = scan.nextInt();

        int[] firstArray = new int[m];
        int[] secondArray = new int[n];

        if (m > 0 && n > 0) {
            for (int i = 0; i < firstArray.length; i++) {
                firstArray[i] = scan.nextInt();
            }

            for (int i = 0; i < secondArray.length; i++) {
                secondArray[i] = scan.nextInt();
            }

            int numberOfOperations = firstArray.length;

            if (secondArray.length < firstArray.length) {
                numberOfOperations = secondArray.length;
            }
            int sum = 0;

            for (int i = 0; i < numberOfOperations; i++) {
                sum += firstArray[i] * secondArray[i];
            }

            System.out.println(sum);
        } else {
            System.out.println("BŁĄD");
        }
    }
}
