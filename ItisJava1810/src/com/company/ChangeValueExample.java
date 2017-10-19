package com.company;

public class ChangeValueExample {
    public static void main(String[] args) {
        int a = 10;
        changeValue(a);
        System.out.println("int a = " + a);

        int b = 10;
        b = changeValueFunction(b);

        int[] arr = {10, 9, 8};
        changeValueOfArray(arr);
        System.out.println("int a[0] = " + arr[0]);
    }

    static void changeValue(int x){
        x = 0;
    }

    static int changeValueFunction(int x){
        return 0;
    }

    static void changeValueOfArray(int[] arr){
        arr[0] = 0;
    }
}
