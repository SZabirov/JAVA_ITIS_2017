package com.company;

import java.io.*;

public class ProductsDaoCsvImplementation implements ProductsDao{
    @Override
    public boolean exists(Product product) throws IOException {
        return false;
    }

    @Override
    public void add(Product product) throws IOException {

    }

    @Override
    public void remove(String product) throws IOException {

    }

    @Override
    public void replace(String product1, String product2) throws IOException {

    }

    @Override
    public int getPrice(String productName) throws IOException, ProductNotFoundException {
        File file = new File("products.csv");
        Reader reader = new FileReader(file);
        BufferedReader br = new BufferedReader(reader);
        String str = br.readLine();
        while (str != null){
            String[] arr = str.split(", ");
            if (arr[0].equals(productName)){
                return Integer.valueOf(arr[1]);
            }
            str = br.readLine();
        }
        throw new ProductNotFoundException("Продукт " + productName + " не найден");
    }









}
