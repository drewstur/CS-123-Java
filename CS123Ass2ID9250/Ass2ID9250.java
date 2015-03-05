/**
* Course: CS 123
* Name: Drew Faber
* ID: 9250
* Assignment: 2
* Display an Integer Digit by Digit
*/

import java.util.Scanner;

public class Ass2ID9250
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    int originalDigits, remainingDigits, firstDigit, secondDigit, thirdDigit, fourthDigit;
    
    System.out.println("Please enter a four-digit integer:");
    originalDigits = keyboard.nextInt();
    
    remainingDigits = originalDigits;
    firstDigit = remainingDigits / 1000;
    remainingDigits = remainingDigits % 1000;
    secondDigit = remainingDigits / 100;
    remainingDigits = remainingDigits % 100;
    thirdDigit = remainingDigits / 10;
    remainingDigits = remainingDigits % 10;
    fourthDigit = remainingDigits / 1;
    
    System.out.println(firstDigit);
    System.out.println(secondDigit);
    System.out.println(thirdDigit);
    System.out.println(fourthDigit);
  }
}