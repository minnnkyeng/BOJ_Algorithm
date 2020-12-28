package xyz.study.algorithm.day25;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        System.out.println(factorial(num));
    }

    public static int factorial(int n){
        if(n<2) return 1;
        else
            return n*factorial(n-1);
    }
}
