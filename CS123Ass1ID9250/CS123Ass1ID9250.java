/**
* Course: CS 123
* Name: Drew Faber
* ID: 9250
* Assignment: 1
* Simple types and expressions
*/

public class CS123Ass1ID9250
{
  public static void main(String args[])
  {
    int monthlyPay = 2555;
    int yearlyExpense = 5000;
    double taxRate = .33;
    double annualPayAfterTax = 0;
    double netIncome = 0;
    
    annualPayAfterTax = monthlyPay * (1-taxRate)*12;
    netIncome = annualPayAfterTax - yearlyExpense;
    
    System.out.println("My monthly pay is $"+monthlyPay);
    System.out.println("My Tax rate is "+taxRate);
    //If you want rounding you can use Math.round(annualPayAfterTax*100.0)/100.0
    System.out.println("My annual pay after tax is $"+annualPayAfterTax);
    System.out.println("My expense a year is $"+yearlyExpense);
    //If you want rounding you can use Math.round(netIncome*100.0)/100.0
    System.out.println("My net income a year is $"+netIncome);
  }
}