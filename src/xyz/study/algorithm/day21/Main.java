package xyz.study.algorithm.day21;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String[] arrInput = input.trim().split(" ");
        int count = 0;

        for(String c:arrInput){
            if("".equals(c))
                continue;
            else
                count++;
        }

        System.out.println(count);
    }
}
