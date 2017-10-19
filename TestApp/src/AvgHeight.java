import java.util.Scanner;

public class AvgHeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число элементов: ");
        int n = sc.nextInt();
        int[] arr = new int[n];


        for (int i = 0; i < n; i++){
            System.out.println("Введите следующий элемент массива: ");
            arr[i] = sc.nextInt();
        }

        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        double avg = (double) sum/n;

        System.out.println(avg);






    }
}








