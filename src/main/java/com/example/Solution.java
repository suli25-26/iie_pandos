package com.example;

public class Solution {
    public static void task01() {
        DataSource dataSource = new DataSource(new Sqlite());
        Product product = new Product();
        product.name = "egér";
        product.price = 30;
        dataSource.createProduct(product);        
    }

}
