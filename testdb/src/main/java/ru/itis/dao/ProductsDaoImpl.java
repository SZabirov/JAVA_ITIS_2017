package ru.itis.dao;

import ru.itis.models.Product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

public class ProductsDaoImpl implements ProductsDao {
    @Override
    public Product getProduct(int id) {
        Connection c = null;
        Statement stmt = null;
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/testdb",
                            "postgres", "postgres");
            stmt = c.createStatement();
            String sql = "SELECT * FROM products WHERE id = " + id;
            ResultSet rs = stmt.executeQuery(sql);
            rs.next();
            String name = rs.getString("name");
            String factory = rs.getString("factory");
            int price = rs.getInt("price");
            int count = rs.getInt("count");
            Product product = new Product(id, name, factory, price, count);
            stmt.close();
            c.close();
            return product;
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
        }
        return null;
    }

    @Override
    public List<Product> getAllProducts() {
        return null;
    }

    @Override
    public void addProduct(Product product) {

    }
}
