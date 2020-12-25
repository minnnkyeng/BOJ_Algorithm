package xyz.study.algorithm.day25;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int sum = 1;
        if(num==0){
         sum = 1;
        }else {
            for (int i = 1; i <= num; i++) {
                sum *= i;
            }
        }
        System.out.println(sum);

    }
}
