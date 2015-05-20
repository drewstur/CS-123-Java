import java.util.Scanner;

public class palindromeID9250
{
  public static void main(String[] args)
  {
    char[] a = new char[80];
    char nextChar = ' ';
    String sequence = "";
    int arraySize = 0;
    Scanner keyboard = new Scanner(System.in);
    
    System.out.println("Enter a sequence of chars, maximum is 80: ");
    sequence = keyboard.nextLine().toLowerCase();

    for(int i = 0; i <= 80 && nextChar != '.'; i++)
    {
      a[i] = sequence.charAt(i);
      nextChar = sequence.charAt(i+1);
      arraySize++;
    }
    System.out.println(isPalindrome(a, arraySize));
  }
  
  public static boolean isPalindrome(char[] a, int used)
  {
    char[] b = new char[used];
    boolean elementsMatch = true;
    
    for(int i = 0; i <= used -1; i++)
    {
      b[i] = a[used -1 - i];
    }
    
    
    for(int i = 0; elementsMatch && i<=used-1; i++)
    {
      if(a[i] != b[i])
        elementsMatch = false;
    }
    return elementsMatch; 
  }
}