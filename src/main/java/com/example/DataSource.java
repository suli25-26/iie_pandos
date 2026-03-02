package com.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class DataSource {
    Database database;
    public DataSource(Database database) {
        this.database = database;
    }
    public void createProduct(Product product) {
        Connection conn = database.connectDb();
        String sql = """
        insert into products
        (name, price)
        values
        (?, ?)
        """;
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, product.name);
            ps.setInt(2, product.price);
            ps.execute();
            conn.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        
    }
    public ArrayList<Product> readProducts() {
        Connection conn = database.connectDb();
        String sql = "select * from products";
        ArrayList<Product> productList = new ArrayList<>();
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()) {
                Product product = new Product();
                product.name = rs.getString("name");
                product.price = rs.getInt("price");
                productList.add(product);
            }
            conn.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return productList;
    }
    public void updateProduct() {}
    public void deleteProduct() {}
}
