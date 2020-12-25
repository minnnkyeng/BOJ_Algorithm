package xyz.study.algorithm.day05;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        int max = scan.nextInt();
        int[] inputArr = new int[input];
        ArrayList<Integer> outputList = new ArrayList<>();

        for (int i = 0; i < input; i++) {
            inputArr[i] = scan.nextInt();
        }

        for (int i = 0; i < input; i++) {
            if (inputArr[i] < max) {
                outputList.add(inputArr[i]);
            }
        }
        for (int i = 0; i < outputList.size(); i++) {
            System.out.println(outputList.get(i) + " ");
        }
    }
}
