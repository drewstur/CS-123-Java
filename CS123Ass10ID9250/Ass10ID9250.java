public class Ass10ID9250
{
  public static void main(String[] args)
  {
    CD9250 cd1 = new CD9250("Storm Front", "Billy Joel", 14.95);
    CD9250 cd2 = new CD9250("Reach For Glory", "Blackmill", 22.99);
    
    CDCollection9250 collection1 = new CDCollection9250();
    collection1.addCD("Reach For Glory", "Blackmill", 22.99);
    
    System.out.println(collection1.toString());
    
    collection1.addCD("Southern Girls", "Life On Repeat", 24.99);
    collection1.addCD("Double Live", "Garth Brooks", 19.99);
    
    System.out.println();
    
    System.out.println(collection1.toString());
  }
}