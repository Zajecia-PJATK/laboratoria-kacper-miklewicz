package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double seconds = scan.nextDouble();
        String planet = scan.next();
        double age;

        switch (planet) {
            case "Merkury":
                age = seconds / (31557600 * 0.2408467);
                break;
            case "Wenus":
                age = seconds / (31557600 * 0.61519726);
                break;
            case "Ziemia":
                age = seconds / 31557600;
                break;
            case "Mars":
                age = seconds / (31557600 * 1.8808158);
                break;
            case "Jowisz":
                age = seconds / (31557600 * 11.862615);
                break;
            case "Saturn":
                age = seconds / (31557600 * 29.447498);
                break;
            case "Uran":
                age = seconds / (31557600 * 84.016846);
                break;
            case "Neptun":
                age = seconds / (31557600 * 164.79132);
                break;
            default:
                age = 0;
        }

        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println(df.format(age));
    }
}
