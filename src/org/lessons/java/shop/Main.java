package org.lessons.java.shop;

import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00 €");

        System.out.println("***********");

        Product product1 = new Product("xbox", "the best",200.00,0.3);
        System.out.println(product1);
        System.out.println(product1.getFullName());
        System.out.println("Product 1 price: " + df.format(product1.getPrice()));
        System.out.println("Product 1 price with iva: " + df.format(product1.getPriceWithIva()));
        System.out.println(product1.padLeft());

        System.out.println("***********");

        Product product2 = new Product("play", "the worst", 250.00, 0.5);
        System.out.println(product2);
        System.out.println(product2.getFullName());
        System.out.println("Product 2 price: " + df.format(product2.getPrice()));
        System.out.println("Product 2 price with iva: " + df.format(product2.getPriceWithIva()));
        System.out.println(product2.padLeft());

        System.out.println("***********");
    }


}
