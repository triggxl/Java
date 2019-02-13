package edu.cscc;

/*
	Chapter 10:	Account program
	Programmer: Kris Kettendorf
	Date: 10/6/18
	Filename:	BankAcctDemo.java
	Purpose: Prompting the user for bank account information including withdraws, deposits, and an annual interest rate.
*/

import java.util.Scanner;
import java.text.DecimalFormat;

public class BankAcctDemo {

        //establishing main method and declaring variables

    public static void main (String[] args) {
        int acctID;
        double acctBalance, annIntRate, withAmt, depAmt;
        Scanner input = new Scanner(System.in);
        DecimalFormat twoDigits = new DecimalFormat("$###,###.00");
        DecimalFormat percent = new DecimalFormat("##.00%");

        //title and user prompts

        System.out.println("   Bank Account Balance");
        System.out.println();

        System.out.print("Enter your account id: ");
        acctID = input.nextInt();
        System.out.println();

        System.out.print("Enter your current Balance: ");
        acctBalance = input.nextDouble();
        System.out.println();

        System.out.print("Enter your annual interest rate: ");
        annIntRate = input.nextDouble();
        System.out.println();

        System.out.print("Enter any withdrawals: ");
        withAmt = input.nextDouble();
        System.out.println();

        System.out.print("Enter any deposits: ");
        depAmt = input.nextDouble();
        System.out.println();

        //instantiating CheckAcct

        CheckAcct account = new CheckAcct(acctID, acctBalance);
        CheckAcct.setAnnualInterestRate(annIntRate);

        //using dot operator to call withdraw and deposit amounts

        account.withdraw(withAmt);
        account.deposit(depAmt);

        //creating system output statements

        System.out.println("Balance for account # " +  account.getId() + " is " +twoDigits.format(account.getBalance()));

        System.out.println("Monthly interest is " + twoDigits.format(account.getMonthlyInterest()));

        System.out.println("This account was created at " +
        account.getDateCreated());
        System.out.println();
        System.out.println();

        System.out.println("Annual interest rate is " + percent.format(CheckAcct.getAnnualInterestRate()));






    }
}
