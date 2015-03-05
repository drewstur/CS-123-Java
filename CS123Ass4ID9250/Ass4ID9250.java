/**
* Course: CS 123
* Name: Drew Faber
* ID: 9250
* Assignment: 4
* Temperature converter
*/

import java.util.Scanner;

public class Ass4ID9250
{
  public static void main(String args[])
  {
    Scanner keyboard = new Scanner(System.in);
    double inputTemperature, outputFahrenheit, outputCelsius;
    char scale, sentinelValue;
    
    do
    {
      System.out.println("Enter a temperature:");
      inputTemperature = keyboard.nextDouble();
      
      System.out.println("C or c for Celsius and F or f for Fahrenheit:");
      scale = keyboard.next().toLowerCase().charAt(0);
      
      while(scale != 'c' && scale != 'f')
      {
        System.out.println("Invalid scale type please enter one of the following C,c,F,f:");
        scale = keyboard.next().toLowerCase().charAt(0);
      }
      
      if(scale == 'c')
      {
        outputFahrenheit = 9*(inputTemperature/5) + 32;
        System.out.println(inputTemperature+"C in Fahrenheit is "+String.format("%.2f",outputFahrenheit));
      }
      else if(scale == 'f')
      {
        outputCelsius = 5*(inputTemperature - 32)/9;
        System.out.println(inputTemperature+"F in Celsius is "+String.format("%.2f",outputCelsius));
      }
      
    System.out.println("Press Q or q to quit or any other key to convert again:");
    sentinelValue = keyboard.next().toLowerCase().charAt(0);
    
    }while(sentinelValue != 'q');
  }
}