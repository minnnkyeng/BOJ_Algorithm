package xyz.study.algorithm.day17;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        int[] arrInput = new int[input.length()];
        int[] arrResult = new int[26];

        for(int i=0; i<arrResult.length; i++){
            arrResult[i] = -1;
        }

        for(int i=0; i<input.length(); i++){
            int idx = (int)(input.charAt(i))-97;
            if(arrResult[idx]!=-1)
                continue;
            else
                arrResult[idx] = i;
        }
        for(int i : arrResult){
            System.out.print(i+" ");
        }
    }
}
