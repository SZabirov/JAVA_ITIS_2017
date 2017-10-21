package com.company;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5, 3, 1, 2, 4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    /** Если на какой-то итерации не было произведено
     * перестановок, то можно закончить цикл.
     * Представьте, что в метод sort будет передан
     * уже упорядоченный массив. синк эбаут ит
     */
    static void sort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]){
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    static void swap (int[] arr, int i1, int i2) {
        int buf = arr[i1];
        arr[i1] = arr[i2];
        arr[i2] = buf;
    }
}











