package com.company;

import java.io.*;

public class ProductsDaoTxtImplementation implements ProductsDao {
    @Override
    public boolean exists(String product) throws IOException {
        boolean exists = false;
        File file = new File("products.txt");
        Reader reader = new FileReader(file);
        BufferedReader br = new BufferedReader(reader);
        String str = br.readLine();
        while (str != null){
            if (str.equals(product)){
                exists = true;
            }
            str = br.readLine();
        }
        return exists;
    }

    @Override
    public void add(String product) throws IOException {
        File file = new File("products.txt");
        Writer writer = new FileWriter(file, true);
        BufferedWriter wr = new BufferedWriter(writer);
        wr.write(product);
        wr.flush();
    }

    @Override
    public void remove(String product) throws IOException {
        //считать все продукты в массив (массив размера size())
        //удаляете из массива product, записываете всё содержимое массива в файл
    }

    /**
     * Считает количество продуктов в файле
     * @return число продуктов
     */
    int size() throws IOException {
        File file = new File("products.txt");
        Reader reader = new FileReader(file);
        BufferedReader br = new BufferedReader(reader);
        String str = br.readLine();
        int count = 0;
        while (str != null){
            count++;
            str = br.readLine();
        }
        return count;
    }
}
