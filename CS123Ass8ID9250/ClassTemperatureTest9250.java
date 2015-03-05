public class ClassTemperatureTest9250
{
  public static void main(String args[])
  {
    Temperature9250 testOne = new Temperature9250();
    Temperature9250 testTwo = new Temperature9250(32.0, 'F');
    Temperature9250 testThree = new Temperature9250(-40.0);
    Temperature9250 testFour = new Temperature9250();
    Temperature9250 testFive = new Temperature9250(100.0);
    Temperature9250 testSix = new Temperature9250(212.0);
    
    testOne.set(5);
    testFour.set(-40.0, 'F');
    testSix.set('F');

    System.out.println(testOne.equals(testTwo));
    System.out.println(testOne.isGreaterThan(testTwo));
    System.out.println(testOne.isLessThan(testTwo));
        
    System.out.println();
    System.out.println(testOne.equals(testFive));
    System.out.println(testOne.isGreaterThan(testFive));
    System.out.println(testOne.isLessThan(testFive));

    System.out.println();
    System.out.println(testTwo.equals(testFour));
    System.out.println(testTwo.isGreaterThan(testFour));
    System.out.println(testTwo.isLessThan(testFour));
    
    System.out.println();    
    System.out.println(testOne.toString());
    System.out.println(testThree.toString());
    System.out.println(testSix.toString());
  }
}