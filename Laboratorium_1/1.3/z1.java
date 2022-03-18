package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[] alphabet = "abcdefghijklmnoprstuvwxyz".toCharArray();

        String sentence = scan.nextLine().toLowerCase();
        char[] sentenceArray = sentence.toCharArray();

        boolean isPangram = true;

        for (char letter : alphabet) {
            if (!isPangram) break;
            for (char element : sentenceArray) {
                isPangram = false;
                if (element == letter) {
                    isPangram = true;
                    break;
                }
            }
        }

        System.out.println(isPangram);
    }
}
