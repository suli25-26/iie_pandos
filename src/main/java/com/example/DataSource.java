package com.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        
    }
    public void readProducts() {}
    public void updateProduct() {}
    public void deleteProduct() {}
}
