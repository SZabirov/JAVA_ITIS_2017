import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        String[] anotherArray = {"молоко", "bread", "cheese"};
        String[] products = new String[5];
        products[0] = "пирог";
        products[1] = "молоко";
        products[2] = "хлеб";
        products[3] = "батон";
        products[4] = "сахар";
        Scanner sc = new Scanner(System.in);
        String productName = sc.next();
        boolean productExists = false;
        for (int i = 0; i < 5; i++){
            if (productName.equals(products[i])){
                productExists = true;
            }
        }
        if (productExists){
            System.out.println("Такой продукт есть");
        } else {
            System.out.println("такого продукта нет");
        }



        
        
        
//        String s1 = "молоко";
//        String s2 = "хлеб";
//        String s3 = "батон";
//        String s4 = "сахар";
//        String s5 = "пирог";
//        Scanner sc = new Scanner(System.in);
//        String product = sc.next();
//        if (product.equals(s1) |
//                product.equals(s2) |
//                product.equals(s3) ...){
//            
//            System.out.println("Такой продукт есть");
//        }
        
    }
}


















