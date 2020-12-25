package xyz.study.algorithm.day10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] intArr = new int[9];
        for(int i=0; i<intArr.length; i++){
            intArr[i] = scan.nextInt();
        }
        int max = intArr[0];
        int maxIdx = 1;
        for(int i=0; i<intArr.length; i++){
            if(max<intArr[i]){
                max = intArr[i];
                maxIdx = i+1 ;
            }
        }
        System.out.println(max);
        System.out.println(maxIdx);
    }
}
