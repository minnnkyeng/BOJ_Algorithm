package xyz.study.algorithm.day06;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int[] result = new int[num];
        for (int i = 0; i < num; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            result[i] = a + b;
        }
        for (int i = 0; i < num; i++) {
            System.out.println("Case #" + (i + 1) + ": " + result[i]);
        }
    }
}
