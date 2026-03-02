package com.example;

import java.sql.Connection;

public class DataSource {
    Database database;
    public DataSource(Database database) {
        this.database = database;
    }
    public void createProduct() {
        Connection conn = database.connectDb();
    }
    public void readProducts() {}
    public void updateProduct() {}
    public void deleteProduct() {}
}
