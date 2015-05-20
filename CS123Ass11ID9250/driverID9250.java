public class driverID9250
{
  public static void main(String args[])
  {
    truckID9250 truck1 = new truckID9250(20.5, 0, "Ford", 8, "Drew");
    truckID9250 truck2 = new truckID9250(12, 23, "Tonka", 4);
    
    
    truck1.owner.writeOutput();
    System.out.println(truck1.toString());
    
    truck1.setManufacturer("Honda");
    System.out.println();
    truck1.owner.writeOutput();
    System.out.println(truck1.toString());
    
    truck1.setTow(5.50);
    System.out.println();
    truck1.owner.writeOutput();
    System.out.println(truck1.toString());
    
    truck1.owner.setName("John");
    System.out.println();
    truck1.owner.writeOutput();
    System.out.println(truck1.toString());
    
    System.out.println();
    truck2.owner.writeOutput();
    System.out.println(truck2.toString());
    
    truck2.setManufacturer("Buick");
    System.out.println();
    truck2.owner.writeOutput();
    System.out.println(truck2.toString());
    
    truck2.setTow(9);
    System.out.println();
    truck2.owner.writeOutput();
    System.out.println(truck2.toString());
    
    truck2.owner.setName("Billy");
    System.out.println();
    truck2.owner.writeOutput();
    System.out.println(truck2.toString());
    
    System.out.println();
    if(truck1.owner.hasSameName(truck2.owner))
    {
      System.out.println(truck1.owner.getName()+"owns both of these vehicles.");
    }
    else
    {
      System.out.println("These two trucks have different owners.");
    }
    
    truck1.owner.setName("Billy");
    
    System.out.println();
    if(truck1.owner.hasSameName(truck2.owner))
    {
      System.out.println(truck1.owner.getName()+" owns both of these trucks.");
    }
    else
    {
      System.out.println("These two trucks have different owners.");
    }
    
    System.out.println();
    if(truck1.hasSameTow(truck2))
    {
      System.out.println("These trucks can tow the same amount.");
    }
    else
    {
      System.out.println("These trucks can't tow the same amount");
    }


  }
}