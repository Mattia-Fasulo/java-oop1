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

        BankAccount account1 = new BankAccount("Mattia");
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


            if (operator == 1) {
                System.out.print("Quanto desideri versare? ");
                double money = Integer.parseInt(scanner.nextLine());
                account1.deposit(money);
            } else if (operator == 2) {
                System.out.print("Quanto desideri prelevare? ");
                double money = Integer.parseInt(scanner.nextLine());
                account1.withdrawal(money);
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
