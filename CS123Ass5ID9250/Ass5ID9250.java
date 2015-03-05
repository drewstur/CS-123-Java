/**
* Course: CS 123
* Name: Drew Faber
* ID: 9250
* Assignment: 5
* grades and printing triangle
*/

import java.util.Scanner;

public class Ass5ID9250
{
  public static void main(String args[])
  {
    Scanner keyboard = new Scanner(System.in);
    int A = 0, B = 0, C = 0, D = 0, F = 0, currentGrade = 0, totalGrades = 0, triangleSize = 0;
       
    System.out.println("Enter grades, to stop enter a negative integer: ");
    
    while(currentGrade >= 0)
    {
      currentGrade = keyboard.nextInt();
      
      if(currentGrade >= 90)
      {
        A++;
      }
      else if(currentGrade >= 80 && currentGrade <= 89)
      {
        B++;
      }
      else if(currentGrade >= 70 && currentGrade <=79)
      {
        C++;
      }
      else if(currentGrade >= 60 && currentGrade <=69)
      {
        D++;
      }
      else if(currentGrade >= 0 && currentGrade <=59)
      {
        F++;
      }                                                  
    }
    
    totalGrades = A+B+C+D+F;
    System.out.println("Total numer of grades = " +totalGrades);
    System.out.println("Number of A's "+ A);
    System.out.println("Number of B's "+ B);
    System.out.println("Number of C's "+ C);
    System.out.println("Number of D's "+ D);
    System.out.println("Number of F's "+ F); 
 
    System.out.println("Enter the size of triangle: ");
    triangleSize = keyboard.nextInt();

    
    for(int ctr = 1; ctr <= triangleSize; ctr++)
    {
      for(int i = 0; i < ctr; i++)
      {
        System.out.print("*");
      }
      System.out.println("");
    }
  
    for(int ctr = triangleSize-1; ctr > 0; ctr--)
    {
      for(int i = ctr; i > 0; i--)
      {
        System.out.print("*");
      }
      System.out.println("");
    } 
  }
}