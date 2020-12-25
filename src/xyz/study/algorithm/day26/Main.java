package xyz.study.algorithm.day26;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        System.out.println(Fibonacci(input));
    }
    public static int Fibonacci(int n){
        if(n<2)
            return n;
        else
            return Fibonacci(n-1)+Fibonacci(n-2);

    }
}
/*

public int Fibonacci(int n){
    if(n<2) return n;
    else
        return Fibonacci(n-1)+Fibonacci(n-2);

}

 */