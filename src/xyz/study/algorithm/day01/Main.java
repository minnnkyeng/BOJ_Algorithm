package xyz.study.algorithm.day01;

import java.util.Scanner;

/**
 * no.2588
 * (세 자리 수)*(세 자리 수 )
 */
public class Main {
    public static void main(String arg[]){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        System.out.println(a*(b%10));
        System.out.println(a*(((b/10)%10)));
        System.out.println(a*(b/100));
        System.out.println(a*b);
    }
}
