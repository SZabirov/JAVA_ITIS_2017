import java.util.Scanner;

public class TopString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число элементов: ");
        int n = sc.nextInt();
        String[] arr = new String[n];


        for (int i = 0; i < n; i++){
            System.out.println("Введите следующий элемент массива: ");
            String str = sc.next();
            arr[i] = str;
        }

        String max1 = "";
        String max2 = "";

        for (int i = 0; i < n; i++) {
            if (arr[i].length() >= max1.length()){
                max2 = max1;
                max1 = arr[i];
            } else {
                if (arr[i].length() > max2.length()){
                    max2 = arr[i];
                }
            }
        }
        System.out.println(max1);
        System.out.println(max2);
    }
}











