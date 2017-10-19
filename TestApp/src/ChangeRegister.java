import java.util.Scanner;

public class ChangeRegister {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        if (c >= 'A' & c <= 'Z'){//если буква заглавная
            char upperChar = (char)(c + 32);
            System.out.println(upperChar);
        } else {//если буква строчная
            char lowerChar = (char)(c - 32);
            System.out.println(lowerChar);
        }

//        if (i >= 65 & i <= 90){//если буква заглавная
//            int upperChar = i + 32;
//            System.out.println((char) upperChar);
//        } else {//если буква строчная
//            int lowerChar = i - 32;
//            System.out.println((char) lowerChar);
//        }
    }
}
