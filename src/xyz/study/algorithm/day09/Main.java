package xyz.study.algorithm.day09;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int[] intArr = new int[num];
        for(int i=0; i<intArr.length; i++){
            intArr[i] = scan.nextInt();
        }

        int min = intArr[0];
        int max = intArr[0];
        for(int i=0; i<intArr.length; i++){
            if(intArr[i]<min){
                min = intArr[i];
            }
            if(max<intArr[i]){
                max = intArr[i];
            }
        }
        System.out.println(min+" "+max);


    }
}
