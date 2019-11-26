package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
     //   ArrayList<Main> invoice = new ArrayList<>();
        //invoice.add();
        Main cafe = new Main();
        cafe.SetcustomerName();
        cafe.Setdate();
        cafe.Setaddress();
        cafe.Setaccountnumber();
        cafe.SetitemName();
        cafe.Setprice();
        cafe.Setquantity();
        cafe.Settaxable();
        String con;
        //  double costofEachItem = 0.0;
        int NoItem = 0;
        double TaxMD = 0.06;
        double TaxDC = 0.053;
        double TaxVA = 0.075;
        double TaxOS = 0.05;
        int quantity = 0;
        double price = 0;
        //double price = 0.0;
        double cost = price * quantity;
        boolean recipt = true;
        while (recipt) {
            System.out.println("Enter the customer name");
            String customerName = input.nextLine();

            System.out.println("Enter the date");
            String date = input.nextLine();
            System.out.println("Enter the Address");
            String address = input.nextLine();
            System.out.println("Enter the Account number");
            long accountnumber = input.nextLong();
            System.out.println("Enter itemName" + input.nextLine());
            String itemName = input.nextLine();
            System.out.println("Enter a price");
            price = input.nextDouble();
            System.out.println("Enter a quantity");
            quantity = input.nextInt();
            System.out.println("the cost of each item:" + price * quantity+ "$ //....please add the number of the items below ?" );
            System.out.println("Subtotal:" + input.nextInt() * price*quantity);
            // boolean tax = true;
         //  double Subtotal = input.nextInt() * price * quantity;
            //  double salesTax = input.nextInt() + Subtotal;

            double x = 0.0 ;
            boolean y = true;
            System.out.println("Do you want to add a state salesTax? :Tax(MD = 0.06,DC = 0.053,VA = 0.075,OS = 0.05)");
            if(y =true ) {
              System.out.println("yes");
               double k = input.nextDouble();

             y =true;
           }
           else {
               System.out.println("no");
           }
           double StatesalesTax=0.0;
           double Subtotal = price*quantity*input.nextInt();
          System.out.println("salesTax"+ Subtotal*StatesalesTax );
           double SalesTax=0.0;
           System.out.println("Calculate the total amount?  "+  input.nextInt() * price*quantity + SalesTax );
                boolean ans = true;
            System.out.println("Do you want to add another item? (Y/N)" + input.equals("Y"));
           String X = "";
            if (ans = true){
               System.out.println (X.equalsIgnoreCase(input.nextLine()));
            }
          else {
           System.out.println("no");
            }
        }


        System.out.println("................print...........");

    //   String recipt;
    //   for (Main C: recipt ) {
     //       System.out.println(C);
        }
  //  } //
  //  double costofEachItem = 0.0;
  //
  // public static double cost(Object price, Object quantity){
      //  double costofEachItem == double(price*quantity);
    //    double cost= input.nextdouble();
    //    return costofEachItem;
  //  }


     //for(String x:userResponse)
     //    System.out.println(x);

    private void SetitemName() {
    }
    private void Settaxable() {
    }

    private void Setquantity() {
    }

    private void Setprice() {
    }

    private void Setname() {
    }

    private void Setaccountnumber() {
    }

    private void Setaddress() {
    }

    private void Setdate() {
    }

    private void SetcustomerName() {
    }

    //private void Setdate() {
 //   return;
   // }
}