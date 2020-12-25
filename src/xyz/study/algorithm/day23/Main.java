package xyz.study.algorithm.day23;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        int num1 = input;
        int count = 0;

        do {
            num1 = ((num1 % 10) * 10) + (((num1 / 10) + (num1 % 10)) % 10);
            count++;
        } while (input != num1);

        System.out.println(count);
    }
}
