package xyz.study.algorithm.day20;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String input1 = scan.next();
        String input2 = scan.next();

        int reverse1 = Integer.parseInt(new StringBuilder(input1).reverse().toString());
        int reverse2 = Integer.parseInt(new StringBuilder(input2).reverse().toString());

        if(reverse1>reverse2)
            System.out.println(reverse1);
        else
            System.out.println(reverse2);
    }
}