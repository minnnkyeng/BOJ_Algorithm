package xyz.study.algorithm.day06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        for (int i = 0; i < num; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            System.out.println("Case #" + (i + 1) + ": " + a + " + " + b + " = " + (a+b));
        }
    }
}
