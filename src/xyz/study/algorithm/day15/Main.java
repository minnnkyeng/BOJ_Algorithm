package xyz.study.algorithm.day15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        String num = scan.next();
        char[] arrNum = num.toCharArray();
        int result = 0;
        for(int i=0; i<arrNum.length; i++){
            result += arrNum[i]-48;
        }
        System.out.println(result);
    }
}
