package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Mariadb implements Database {

    @Override
    public Connection connectDb() {
        String url = "jdbc:mariadb://localhost:3306/pandos";
        String user = "pandos";
        String pass = "titok";
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url, user, pass);
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return conn;
    }
    
}
