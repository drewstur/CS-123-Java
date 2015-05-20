public class truckID9250 extends vehicleID9250
{
  private double loadCapacity;
  private double towCapacity;
  
  public truckID9250(double load, double tow, String newManufacturer, int newCylinders, String name)
  {
    super(newManufacturer, newCylinders, name);
    this.loadCapacity = load;
    this.towCapacity = tow;
  }
  
  public truckID9250(double load, double tow, String newManufacturer, int newCylinders)
  {
    super(newManufacturer, newCylinders);
    this.loadCapacity = load;
    this.towCapacity = tow;
  }
  
  
  public double getLoad()
  {
    return this.loadCapacity;
  }
  
  public double getTow()
  {
    return this.towCapacity;
  }
  
  public void setLoad(double load)
  {
    this.loadCapacity = load;
  }
  
  public void setTow(double tow)
  {
    this.towCapacity = tow;
  }
  
  public boolean hasSameTow(truckID9250 otherTruck)
  {
    return this.towCapacity == otherTruck.towCapacity;
  }
  
  public boolean hasSameLoad(truckID9250 otherTruck)
  {
    return this.loadCapacity == otherTruck.loadCapacity;
  }
  
  public String toString()
  {
    return "Manufacturer: "+this.getManufacturer()+"\nCylinders: "+this.getCylinders()+"\nLoad Capacity: "+this.getLoad()+"\nTow Capacity: "+this.getTow();
  }
}