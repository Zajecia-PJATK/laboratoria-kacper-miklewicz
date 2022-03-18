package com.company;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        double a, b, c;
        Scanner scan = new Scanner(System.in);

        a = scan.nextDouble();
        b = scan.nextDouble();
        c = scan.nextDouble();

        scan.close();

        if (a > 0 && b > 0 && c > 0) {
            if ((a + b) > c && (a + c) > b && (b + c) > a) {
                System.out.println("TAK");
            } else {
                System.out.println("NIE");
            }
        } else {
            System.out.println("BŁĄD");
        }
    }
}