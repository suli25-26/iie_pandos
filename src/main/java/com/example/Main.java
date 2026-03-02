package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Adatbázis indul...");

        DataSource dataSource = new DataSource(new Sqlite());
        Product product = new Product();
        product.name = "egér";
        product.price = 30;
        dataSource.createProduct(product);

    }
}