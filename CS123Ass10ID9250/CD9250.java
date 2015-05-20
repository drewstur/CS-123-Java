public class CD9250
{
  private String title;
  private String artist;
  private double cost;
  
  public CD9250(String title, String artist, double cost)
  {
    this.title = title;
    this.artist = artist;
    this.cost = cost;
  }
  
  public String toString()
  {
    return this.title+" "+this.artist+" "+this.cost;
  }
}