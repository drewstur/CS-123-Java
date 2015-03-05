import java.lang.Math;
public class Temperature9250
{
  private double degrees = 0.0;
  private char units = 'C';
  
  public Temperature9250()
  {
  }
   
  public Temperature9250(double newDegrees)
  {
    this.degrees = newDegrees;
    this.units = 'C';
  }
  
  public Temperature9250(char newUnits)
  {
    this.degrees = 0.0;
    this.units = newUnits;
  }
  
  public Temperature9250(double newDegrees, char newUnits)
  {
    this.degrees = newDegrees;
    this.units = newUnits;
  }

  public void set(double newDegrees, char newUnits)
  {
    this.degrees = newDegrees;
    this.units = newUnits;
  }
  
  public void set(double newDegrees)
  {
    this.degrees = newDegrees;
  }
  
  public void set(char newUnits)
  {
    this.units = newUnits;
  }
  
  public double getC()
  {
    return 5*(this.degrees - 32)/9;
  }
  
  public double getF()
  {
    return 9*(this.degrees/5) + 32;
  }
  
  public boolean equals(Temperature9250 another)
  {
    boolean result;
    double originalTemp, paraTemp;
       
    if(another.units == 'F')
    {
      paraTemp = another.getC();
    }
    else
    {
      paraTemp = another.degrees;
    }
    
    if(this.units == 'F')
    {
      originalTemp = this.getC();
    }
    else
    {
      originalTemp = this.degrees;
    }
    
    if(originalTemp == paraTemp)
    {
      result = true;
    }
    else
    {
      result = false;
    }
    
    return result;
  }
  
  public boolean isGreaterThan(Temperature9250 another)
  {
    boolean result;
    double originalTemp, paraTemp;
    
    if(another.units == 'F')
    {
      paraTemp = another.getC();
    }
    else
    {
      paraTemp = another.degrees;
    }
    
    if(this.units == 'F')
    {
      originalTemp = this.getC();
    }
    else
    {
      originalTemp = this.degrees;
    }
    
    if(originalTemp > paraTemp)
    {
      result = true;
    }
    else
    {
      result = false;
    }
    
    return result;
  }
  
  public boolean isLessThan(Temperature9250 another)
  {
    boolean result;
    double originalTemp, paraTemp;
    
    if(another.units == 'F')
    {
      paraTemp = another.getC();
    }
    else
    {
      paraTemp = another.degrees;
    }
    
    if(this.units == 'F')
    {
      originalTemp = this.getC();
    }
    else
    {
      originalTemp = this.degrees;
    }
    
    if(originalTemp < paraTemp)
    {
      result = true;
    }
    else
    {
      result = false;
    }
    
    return result;
  }
  
  public String toString()
  {
    String objectType, objectConvert;
    Double objectTemp;
    
    if(this.units == 'C')
    {
      objectType = "Celsius";
    }
    else
    {
      objectType = "Fahrenheit";
    }
    
    if(this.units == 'C')
    {
      objectConvert = "Fahrenheit";
    }
    else
    {
      objectConvert = "Celsius";
    }
    
    if(this.units == 'C')
    {
      objectTemp = this.getF();
    }
    else
    {
      objectTemp = this.getC();
    }
   return Double.toString(this.degrees)+" "+ objectType +" which is "+ Double.toString(objectTemp) +" degrees "+ objectConvert;
  }
}