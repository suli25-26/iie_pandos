package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Adatbázis indul...");

        new DataSource(new Sqlite());
    }
}