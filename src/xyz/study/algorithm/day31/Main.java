package xyz.study.algorithm.day31;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int testCase = scan.nextInt();

        for(int i=0; i<testCase; i++){
            int k = scan.nextInt();
            int n = scan.nextInt();

            System.out.println(resident(k,n));
        }
    }

    public static int resident(int k, int n){
        if(n==0) {
            return 0;
        }else if(k==0){
            return n;
        }else{
            return resident(k,n-1)+resident(k-1,n);
        }
    }
}
