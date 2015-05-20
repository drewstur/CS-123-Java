import java.util.Scanner;
import java.text.DecimalFormat;

public class intArrayID9250
{
  public static void main(String[] args)
  {
    int arraySize;
    int[] userInts;
    Scanner keyboard = new Scanner(System.in);
    String pattern = "###.####";
    DecimalFormat decimalFormat = new DecimalFormat(pattern);
    
    System.out.println("How many Ints will you enter?: ");
    arraySize = keyboard.nextInt();
    userInts = new int[arraySize];

    System.out.println("Enter "+arraySize+" integers one per line: ");
    for(int i = 0; i <= arraySize-1; i++)
    {
      userInts[i] = keyboard.nextInt();
    }
    
    System.out.println("The sum is "+arraySum(userInts, arraySize));
    
    System.out.println("the numbers are: ");

    for(int i = 0; i <= arraySize-1; i++)
    {
      System.out.println(userInts[i]+", which is "+decimalFormat.format(percentOfArray(userInts[i], arraySum(userInts, arraySize)))+"% of the sum.");
    }
  }
  
  public static int arraySum(int[] array, int arraySize)
  {
    int arraySum = 0;
    for(int i = 0; i <= arraySize-1; i++)
    {
      arraySum += array[i];
    }
    return arraySum;
  }
  
  public static double percentOfArray(int arrayValue, int arraySum)
  {
    return (double)arrayValue/arraySum*100;
  }
}