public class TriangleTesterAss7ID9250
{
  public static void main(String arg[])
  {
    Triangle9250 testOne = new Triangle9250();
    Triangle9250 testTwo = new Triangle9250();
    Triangle9250 testThree = new Triangle9250();
    Triangle9250 testFour = new Triangle9250();
    
    testOne.setSides(1, 2, 1);
    testTwo.setSides(3, 4, 5);
    testThree.setSides(3, 3, 3);
    testFour.setSides(3, 3, 5);
    
    System.out.println(testOne.toString()+" is "+testOne.getTypeString()+" with area "+testOne.area()+" and perimeter "+testOne.perimeter());
    System.out.println(testTwo.toString()+" is "+testTwo.getTypeString()+" with area "+testTwo.area()+" and perimeter "+testTwo.perimeter());
    System.out.println(testThree.toString()+" is "+testThree.getTypeString()+" with area "+testThree.area()+" and perimeter "+testThree.perimeter());
    System.out.println(testFour.toString()+" is "+testFour.getTypeString()+" with area "+testFour.area()+" and perimeter "+testFour.perimeter());
  }
}