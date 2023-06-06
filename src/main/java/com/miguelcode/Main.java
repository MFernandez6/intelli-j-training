package com.miguelcode;

import com.miguelcode.model.Product;

public class Main {
    public static void main(String[] args) {
        String helloWorld = "updating all the github integration!!";
        System.out.println(helloWorld + "!!!");

        Product product = new Product("Keyboard");

        System.out.println(product.getName());

    }
}