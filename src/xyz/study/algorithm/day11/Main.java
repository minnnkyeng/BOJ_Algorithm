package xyz.study.algorithm.day11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int testCase = scan.nextInt();
        for(int i=0; i<testCase; i++){
            int stuNum = scan.nextInt();
            int[] stuScore = new int[stuNum];
            int total = 0;
            double avg = 0;
            for(int j=0; j<stuNum; j++){
                stuScore[j] = scan.nextInt();
                total += stuScore[j];
            }
            avg = ((double)total/stuNum);
            int cnt = 0;
            for(int score : stuScore){
                if(avg<score){
                    cnt++;
                }
            }
            System.out.printf("%.3f%%\n", ((double)cnt/stuNum)*100.0);
        }
    }
}
