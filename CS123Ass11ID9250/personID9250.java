public class personID9250
{
  private String name;
  
  public personID9250()
  {
    this.name = "No name yet";
  }
  
  public personID9250(String name)
  {
    this.name = name;
  }
  
  public void setName(String newName)
  {
    this.name = newName;
  }
  
  public String getName()
  {
    return this.name;
  }
  
  public void writeOutput()
  {
    System.out.println("Name: "+name);
  }
  
  public boolean hasSameName(personID9250 otherPerson)
  {
    return this.name.equalsIgnoreCase(otherPerson.name);
  }
}