package xyz.study.algorithm.day24;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int count = scan.nextInt();
        int[] arrNum = new int[count];
        for(int i=0; i<count; i++){
            arrNum[i] = scan.nextInt();
        }
        for(int i=0; i<arrNum.length-1; i++){
            for(int j=i+1; j<arrNum.length; j++){
                int temp = 0;
                if(arrNum[i]>arrNum[j]){
                    temp = arrNum[i];
                    arrNum[i] = arrNum[j];
                    arrNum[j] = temp;
                }
            }
        }

        for(int i=0; i<arrNum.length; i++){
            System.out.println(arrNum[i]);
        }
    }
}
