package xyz.study.algorithm.day19;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        input = input.toUpperCase();
        int[] arrInput = new int[26];
        int max = -1;
        char result = 0;
        for(int i=0; i<input.length(); i++){
            arrInput[input.charAt(i)-65] ++;
        }
        for(int i=0 ;i<arrInput.length; i++){
            if(arrInput[i]>max){
                max = arrInput[i];
                result = (char)(i+65);
            }else if(arrInput[i]==max){
               result = '?';
            }
        }
        System.out.println(result);

    }
}
