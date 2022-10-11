package org.example;

import org.example.model.Customer;

import java.util.Scanner;

public class Main {
    /**
     *
     * @param args I write the usage of this method and parameters
     */
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//
//        boolean g = true;
//        byte b = 78;
//        char a = 'h';
//        int c = 234562345;
//        short gg = 20333;
//        long ff = 12323456789033l;
//        float f = 23.7f;
//        double gg2 = 23.7;
//        double sci = 2.4566e-12;
//        double sci2 = 2.4566e+12;
//
//        long xmax = Integer.MAX_VALUE;
//        System.out.println("xmax = "+ xmax);
//        xmax++;
//        System.out.println("xmax = "+ xmax);
//
//
//        String name = "Spiros";
//        System.out.println(name);

//        int customerBalance = 1000;
//        customerBalance += 100;
//        System.out.println("Customer Balance is "+customerBalance);
//        //this is a comment
//        /*
//         Another comments
//         */
//        if(customerBalance> 1050){
//            System.out.println("You are eligible to a free ticket");
//        }
//        double a = 0.1;
//        double b = 0.2;
//        System.out.println(a+b);
//        if(Math.abs((a+b) - 0.3)< 0.001)
//        {
//            System.out.println("The values are identical");
//        }
//        else System.out.println("The values are not identical");


//        double initialAmount = 1000.0;
//        double interestRatePerYear = 0.02;
//        int years = 10;
//
//        double amount = initialAmount;
//        for(int year = 0; year < years; year++){
//            amount += amount * interestRatePerYear;
//        }
//        double roundedValues = (double) Math.round(amount*100)/100;
//        System.out.println("Final amount is "+ roundedValues);
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Give the initial amount: ");
//        double initialAmount = scanner.nextDouble();
//        System.out.println("Give the interest rate: ");
//        double interestRatePerYear = scanner.nextDouble();
//        System.out.println("Give the years: ");
//        int years = scanner.nextInt();
//
//        double amount = initialAmount;
//        for(int year = 0; year < years; year++){
//            amount += amount * interestRatePerYear;
//        }
//        double roundedValues = (double) Math.round(amount*100)/100;
//        System.out.println("Final amount is "+ roundedValues);

        Customer customer = new Customer();

        System.out.println(customer.getCustomerId());

        Customer anotherCustomer = new Customer();

        anotherCustomer.setCustomerId(45);
        anotherCustomer.setAddress("Athens");
        System.out.println(anotherCustomer.getCustomerId()+"   "+ anotherCustomer.getAddress());
    }
}