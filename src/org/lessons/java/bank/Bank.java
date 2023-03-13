package org.lessons.java.bank;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00 €");
        Scanner scanner = new Scanner(System.in);

        boolean active = true;
        int operator;

        System.out.println("***********");
        System.out.println("Benvenuto in Java Bank");
        System.out.println("***********");
        System.out.println();

        System.out.print("A chi è intestato il conto?");
        BankAccount account1 = new BankAccount(scanner.nextLine());
        System.out.println();

        System.out.println("Ho creato correttamente il conto :");
        System.out.println("***********");
        System.out.println(account1);
        System.out.println(account1.getName() + " " + account1.getMoneyCountFormatted());
        System.out.println("***********");

        while(active) {
            System.out.println();
            System.out.println("Scegli quale operazione eseguire:");

            System.out.println("1: Versa una somma di denaro");
            System.out.println("2: Preleva una somma di denaro");
            System.out.println("3: Visualizza il saldo");
            System.out.println("4: Esci");


            System.out.println();
            System.out.print("La tua scelta: ");
            operator = Integer.parseInt(scanner.nextLine());
            System.out.println();


            if (operator == 1) {
                System.out.print("Quanto desideri versare? ");
                double money = Integer.parseInt(scanner.nextLine());
                account1.deposit(money);
            } else if (operator == 2) {
                System.out.print("Quanto desideri prelevare? ");
                double money = Integer.parseInt(scanner.nextLine());
                account1.balance(money);
            } else if(operator == 3){
                System.out.println(account1.getName() + " " + account1.getMoneyCountFormatted());
            }else if (operator == 4) {
                System.out.println("Grazie, a presto!");
                active = false;
            } else {
                System.out.println("Valore non valido!");
            }
        }


    }
}
