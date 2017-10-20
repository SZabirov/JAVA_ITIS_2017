package com.company;

import java.util.Scanner;

public class BackwardsArray {
    public static void main(String[] args) {
        int[] array;
        Scanner sc = new Scanner(System.in);
        System.out.println("Длина массива:");
        int n = sc.nextInt();
        array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Введите число");
            array[i] = sc.nextInt();
        }
        for (int i = n - 1; i >= 0; i--){
            System.out.println(array[i]);
        }
    }
}
