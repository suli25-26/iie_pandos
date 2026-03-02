package com.example;

import java.util.ArrayList;

public class Solution {
    public static void task01() {
        DataSource dataSource = new DataSource(new Sqlite());
        Product product = new Product();
        product.name = "egér";
        product.price = 30;
        dataSource.createProduct(product);        
    }
    public static void task02() {
        DataSource dataSource = new DataSource(new Sqlite());
        ArrayList<Product> productList = dataSource.readProducts();
        for(Product product : productList) {
            System.out.println(
                product.name + " " +
                product.price
            );
        }
    }
}
