package com.company;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static char[] wordArray = new char[100];

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int index = 0;

        while (scan.hasNext()) {
            char[] newWordArray = scan.next().toCharArray();
            System.arraycopy(newWordArray, 0, wordArray, index, newWordArray.length);
            index += newWordArray.length;
        }

        index = 0;
        for (char element : wordArray) {
            if (element == 0) {
                break;
            } else {
                index++;
            }
        }

        boolean isPalindrome = true;
        for (int i = 0; i < index; i++) {
            if (wordArray[i] == wordArray[index - 1 - i]) {
                continue;
            } else {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.print("TAK");
        } else {
            System.out.print("NIE");
        }

    }
}
