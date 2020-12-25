package xyz.study.algorithm.day18;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int testCase = scan.nextInt();
        int loopCnt = 0;
        String input = null;

        for(int i=0; i<testCase; i++){
            loopCnt = scan.nextInt();
            input = scan.next();

            for(int j=0; j<input.length(); j++){
                for(int k=0; k<loopCnt; k++){
                    System.out.print(input.charAt(j));
                }
            }
            System.out.println();
        }
    }
}
