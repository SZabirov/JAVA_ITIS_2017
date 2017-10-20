package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Сколько чисел будет в последовательности:");
        int n = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Введите следующее число:");
            int x = sc.nextInt();
            if (x == 42) {
                count = count + 1;
            }
        }
        System.out.println(count);
    }
}






