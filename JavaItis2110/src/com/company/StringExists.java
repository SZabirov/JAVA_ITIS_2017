package com.company;

public class StringExists {
    public static void main(String[] args) {
    }

    static boolean exists(String[] arr, String str) {
        boolean stringExists = false;
        boolean b = true;
        for (int i = 0; i < arr.length & !stringExists; i++) {
            if (arr[i].equals(str))
                stringExists = true;
        }
        return stringExists;
    }
}










