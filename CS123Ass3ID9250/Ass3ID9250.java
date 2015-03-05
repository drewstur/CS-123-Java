/**
* Course: CS 123
* Name: Drew Faber
* ID: 9250
* Assignment: 3
* String Processing
*/

import java.util.*;
import java.util.Scanner;

public class Ass3ID9250
{
  public static void main(String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    String textLine, newTextLine, subStringLast, subStringFirst;
    int lastIndex, firstIndex;
    
    System.out.println("Please enter a line of text with no punctuation:");
    textLine = keyboard.nextLine();
    
    //find first and last index of blank space
    firstIndex = textLine.indexOf(" ");
    lastIndex = textLine.lastIndexOf(" ");
    
    //finding substrings and trim
    subStringFirst = textLine.substring(0, firstIndex).trim();
    subStringLast = textLine.substring(lastIndex).trim();
    
    //find middle substring using first and last index and trim
    newTextLine = textLine.substring(firstIndex, lastIndex).trim();
    
    //build new string of text swaping first and last word and capitizing first letter
    newTextLine = subStringLast.substring(0,1).toUpperCase() + subStringLast.substring(1) + (" "+newTextLine+" ") + (subStringFirst);
      
    System.out.println("I have changed your text:");
    System.out.println(newTextLine);
  }
}