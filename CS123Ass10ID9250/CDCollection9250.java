import java.text.DecimalFormat;

public class CDCollection9250
{
  private DecimalFormat df = new DecimalFormat("###,###.##");
  private String[] CDCollection ;
  private int count = 0;
  private double totalCost = 0;
  
  public CDCollection9250()
  {
    CDCollection = new String[0];
  }
  
  public void addCD(String title, String artist, double cost)
  {
    totalCost += cost;
    String[] temp = new String[this.count];
    
    for(int i = 0; i < this.count; i++)
    {
      temp[i] = this.CDCollection[i];
    }
    
    CDCollection = new String[count + 1];
    
    for(int i = 0; i < temp.length; i++)
    {
      CDCollection[i] = temp[i];
    }
    
    CDCollection[this.count] = cost+" "+title+" "+artist;

    count++;
  }
  
  public String toString()
  {
    String output = "";
    
    for(int i = 0; i < this.count; i++)
    {
      output += "$"+CDCollection[i]+"\n";
    }
    return "My CD collection"+
      "\nNumber of CDs: "+this.count+
      "\nTotal cost: $"+totalCost+
      "\nAverage cost: $"+df.format(totalCost/this.count)+
      "\nCD List:\n"+output;
  }
}