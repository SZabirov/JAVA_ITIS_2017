package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException, ProductNotFoundException {
        ProductsDao dao = new ProductsDaoCsvImplementation();
        System.out.println(dao.getPrice("яблоки"));

        Product product = new Product("хлеб", 40, "Хлебзавод 1");
        Object obj1 = new Product("", 5, "");
        String s = "abcd";
        Object obj2 = s;
        String s1 = (String) obj2;
        //dao.add(product);

//        String str = "abc, abc";
//        String[] strings = str.split(",");
//        System.out.println(strings[0]);
//        System.out.println(strings[1]);

//        ProductsDao dao = new ProductsDaoTxtImplementation();
//        dao.remove("яблоки");

//        File file = new File("products.txt");
//        Reader reader = new FileReader(file);
//        BufferedReader br = new BufferedReader(reader);
//        String str = br.readLine();
//        String str1 = br.readLine();
//        String str2 = br.readLine();
//        System.out.println(str);
//        System.out.println(str1);
//        System.out.println(str2);
    }
}
