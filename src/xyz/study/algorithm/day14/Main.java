package xyz.study.algorithm.day14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int inputArr[] = new int[10];
        int outputArr[] = new int[42];
        int mod = 0;
        int result = 0;
        for(int i=0; i<10; i++){
            inputArr[i] = scan.nextInt();
            mod  = inputArr[i]%42;
            outputArr[mod]++;
        }
        for(int i=0; i<42; i++){
            if(outputArr[i]!=0)
                result++;
        }
        System.out.println(result);
    }
}
