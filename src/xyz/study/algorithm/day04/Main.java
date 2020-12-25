package xyz.study.algorithm.day04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testCase = scan.nextInt();
        int[] result = new int[testCase];
        for (int i = 0; i < testCase; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            result[i] = a + b;
        }
        for (int i = 0; i < testCase; i++) {
            System.out.println(result[i]);
        }
    }
}
