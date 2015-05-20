public class computeArray
{
  public int arraySum(int[] array, int arraySize)
  {
    int arraySum = 0;
    for(int i = 0; i <= array.length; i++)
    {
      arraySum += array[i];
    }
    return arraySum;
  }
}