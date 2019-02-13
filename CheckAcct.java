package edu.cscc;

/*
	Chapter 10:	Account program
	Programmer: Kris Kettendorf
	Date: 10/6/18
	Filename:	CheckAcct.java
	Purpose: Prompting the user for bank account information including withdraws, deposits, and an annual interest rate.
*/

import java.util.Date;

class CheckAcct {

    //declare variables

    private int ID;
    private double balance;
    private static double annualInterestRate;
    private Date DateCreated =new Date();

    //creating CheckAcct method

    CheckAcct(int newID, double balance){

        this.ID = newID;
        this.balance = balance;
    }

    //retrieving ID, balance, setting annual interest rate

    int getId(){ return this.ID; }
    double getBalance(){ return this.balance; }
    public static double getAnnualInterestRate() { return annualInterestRate; }
    public static double setAnnualInterestRate(double rate){
        return annualInterestRate = rate;
    }

    //outputting current date

    public Date getDateCreated() { return this.DateCreated; }

    //calculating monthly interest

    public double getMonthlyInterest() { return balance*(annualInterestRate/12.0);}

    //calculating withdraws from balance

    public void withdraw(double withAmt) {
         this.balance -=withAmt;
    }

    //calculating deposits from balance

    public void deposit(double depAmt) {
        this.balance +=depAmt;
    }

}
