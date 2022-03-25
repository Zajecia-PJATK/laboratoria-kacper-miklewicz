package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        if (a <= 0 || b <= 0) {
            System.out.print("BŁĄD");
            return;
        }

        int[][] matrix = new int[a][b];

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }

        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                if (j < a - 1) {
                    System.out.print(matrix[j][i] + " ");
                } else {
                    System.out.print(matrix[j][i]);
                }
            }
            System.out.print("\n");
        }
    }
}
