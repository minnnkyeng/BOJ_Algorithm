package xyz.study.algorithm.day30;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int testCase = scan.nextInt();
        for(int i=0; i<testCase; i++){
            String answer = scan.next();
            int sum = 0;
            int cnt = 0;
            for(int j=0; j<answer.length(); j++){
                char c = answer.charAt(j);
                if(c=='O'){
                    if(j==0||answer.charAt(j-1)=='X'){
                        cnt=1;
                    }else if(answer.charAt(j-1)=='O'){
                        cnt++;
                    }
                    sum+=cnt;
                }else if(c=='X'){
                    cnt=0;
                }
            }
            System.out.println(sum);
        }
    }
}
