package org.lessons.java.bank;

import java.text.DecimalFormat;

public class BankAccount {
    //*******Fields********
    private static int idCount = 0;

    private final int id;
    private String name;
    private double moneyCount;


    //******Constructor*******
    public BankAccount(String name){


        id = idCount;
        idCount++;

        this.name = name;
        moneyCount = 0.0;



    }

    //*******Methods********


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getMoneyCount() {
        return moneyCount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMoneyCountFormatted(){
        DecimalFormat df = new DecimalFormat("0.00 €");
        return df.format(moneyCount);

    }

    public void deposit(double num){

        if (num < 0){
            System.out.println("Non puoi versare una cifra negativa!");

        }else{
            moneyCount += num;
            System.out.println("Versamento avvenuto con successo");
        }
    }

    public void balance(double num){
        DecimalFormat df = new DecimalFormat("0.00 €");
        if(num < 0){
            System.out.println("Non puoi versare una cifra negativa!");
        } else {
            moneyCount -= num;
            if(moneyCount < 0){
                double diff = moneyCount - 0;
                double money = num - Math.abs(diff);
                System.out.println("Hai superato il limite del tuo saldo, hai prelevato solamente: " + df.format(money));
                moneyCount = 0;
            } else {
                System.out.println("Hai prelevato: " + df.format(num));
                System.out.println("Saldo attuale: " + df.format(moneyCount));
            }


        }
    }

    @Override
    public String toString() {
        return "BankAccount " + id + " { " +
                "id = " + id +
                ", name = '" + name + '\'' +
                ", moneyCount = " + moneyCount +
                " } ";
    }
}
