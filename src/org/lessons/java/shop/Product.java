package org.lessons.java.shop;

import java.text.DecimalFormat;
import java.util.Random;

public class Product {
    //*******Fields********
    private int id;
    private String name;
    private String description;
    private double price;
    private double iva;
    private static int count = 0;

    //*******constructor*******
    public  Product(String name, String description, double price, double iva){
        Random random = new Random();
        id = random.nextInt(100,999);
        this.name = name;
        this.description = description;
        this.price = price;
        this.iva = iva;
        count++;
    }

    //********methods********
    public String padLeft(){
        return padLeft(id, 8,'0');
    }
    public String padLeft(int num, int lenght, char substitute){
        DecimalFormat df = new DecimalFormat("#,###,###,##0");

        String formattedNum = df.format(num);

        return String.format("%" + lenght + "s", formattedNum).replace(' ', substitute) ;
    }

    //----getter----
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public  double getIva() {
        return iva;
    }

    public double getPriceWithIva(){
        return price *(1 + iva) ;
    }

    public String getFullName(){
        return "id: " + id + ", name: " + name;
    }

    //----setter---
    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }


    //-----to string------
    @Override
    public String toString() {
        return "Product " + count + " {" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", iva=" + iva +
                '}';
    }
}
