package xyz.study.algorithm.day33;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        char ch;
        int cnt = 0;

        for(int i=0; i<str.length(); i++){
            ch = str.charAt(i);

            switch (ch){
                case 'A' : case 'B': case 'C':
                    cnt += 3;
                    break;
                case 'D' : case 'E': case 'F':
                    cnt += 4;
                    break;
                case 'G' : case 'H': case 'I':
                    cnt += 5;
                    break;
                case 'J' : case 'K': case 'L':
                    cnt += 6;
                    break;
                case 'M' : case 'N': case 'O':
                    cnt += 7;
                    break;
                case 'P' : case 'Q': case 'R': case 'S':
                    cnt += 8;
                    break;
                case 'T' : case 'U': case 'V':
                    cnt += 9;
                    break;
                case 'X' : case 'W': case 'Y': case 'Z':
                    cnt += 10;
                    break;
            }
        }
       System.out.println(cnt);
    }
}
