package xyz.study.algorithm.day03;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hour = scan.nextInt();
        int min = scan.nextInt();

        if (min < 45) {
            min = (min + 60) - 45;
            if(hour == 0){
                hour = 23;
            }else{
                hour -= 1;
            }
        }else{
            min -= 45;
        }

        System.out.println(hour+" "+min);

    }
}
