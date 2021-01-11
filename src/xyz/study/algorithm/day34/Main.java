package xyz.study.algorithm.day34;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int w = scan.nextInt();
        int h = scan.nextInt();

        int minX = Math.min(x,w-x);
        int minY = Math.min(y,h-y);

        System.out.println(Math.min(minX, minY));
    }
}
