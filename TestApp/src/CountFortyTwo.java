import java.util.Scanner;

public class CountFortyTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int count = 0;
        while (i != 0){
            if (i == 42){
                count++;
            }
            i = sc.nextInt();
        }
        System.out.println(count);
    }
}
