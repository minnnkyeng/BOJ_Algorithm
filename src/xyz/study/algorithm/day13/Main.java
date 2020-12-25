package xyz.study.algorithm.day13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] arrList = new int[10];
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int result = a*b*c;
        while(result!=0){
            arrList[result%10] ++;
            result /= 10;
        }
        for(int i=0; i<arrList.length; i++){
            System.out.println(arrList[i]);
        }

    }
}
