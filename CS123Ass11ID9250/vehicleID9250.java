public class vehicleID9250
{
  private String manufacturer;
  private int cylinders;
  public personID9250 owner;

  public vehicleID9250(String newManufacturer, int newCylinders, String name)
  {
    this.manufacturer = newManufacturer;
    this.cylinders = newCylinders;
    this.owner = new personID9250(name);
  }
  
  public vehicleID9250(String newManufacturer, int newCylinders)
  {
    this.manufacturer = newManufacturer;
    this.cylinders = newCylinders;
    this.owner = new personID9250();
  }
  
  public String getManufacturer()
  {
    return this.manufacturer;
  }
  
  public int getCylinders()
  {
    return this.cylinders;
  }
  
  public void setManufacturer(String manufacturer)
  {
    this.manufacturer = manufacturer;
  }
  
  public void setCylinders(int cylinders)
  {
    this.cylinders = cylinders;
  }
}