package com.company;

public class ProcedureExample {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int minValue = min(a, b);
        int minValue1 = min(78, 79);
        int minValue2 = min(56, 65);
        int minValue3 = min(5, 6);
        System.out.println(minValue);
    }

    //процедура, ничего не возвращает
    static void sum(int a, int b){
        System.out.println(a + b);
    }

    //функция, возвращает значение типа int
    static int min (int x, int y){
        if (x > y){
            return y;
        } else {
            return x;
        }
    }
}
