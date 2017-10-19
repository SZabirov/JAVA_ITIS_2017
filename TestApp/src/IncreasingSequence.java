import java.util.Scanner;

public class IncreasingSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество элементов (как минимум 2):");
        int n = scanner.nextInt();
        System.out.print("Введите число: ");
        int prev = scanner.nextInt();
        int num;
        boolean isIncreasing = true;
        for (int i = 0; i < n - 1; i++){
            System.out.println("Введите число: ");
            num = scanner.nextInt();
            if (num <= prev){
                isIncreasing = false;
            }
        }
        if (isIncreasing == true){
            System.out.println("Возрастающая");
        } else {
            System.out.println("Невозрастающая");
        }
    }
}



