package com.company;

import java.util.Scanner;

public class MaxAbs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Сколько чисел будет в последовательности:");
        int n = sc.nextInt();
        int max = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Введите число:");
            int x = sc.nextInt();
            int absX =  Math.abs(x);
            if (absX > max) {
                max = absX;
            }
        }
        System.out.println(max);
    }
}












