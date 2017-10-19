import java.util.Scanner;

public class MaxAbs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int max = Math.abs(i);
        while (i != 0){
            i = scanner.nextInt();
            if (Math.abs(i) > max){
                max = Math.abs(i);
            }
        }
        System.out.println(max);
    }
}
