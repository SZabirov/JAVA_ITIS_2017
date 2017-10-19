import java.util.Scanner;

public class ArrayBackwards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число элементов: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        //считываем элементы массива по одному
        for (int i = 0; i < n; i++){
            System.out.println("Введите следующий элемент массива: ");
            int num = sc.nextInt();
            arr[i] = num;
        }

        for (int i = n - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }

    }
}
