import java.lang.Math;
public class Ass7ID9250
{
  private double mySide1;
  private double mySide2;
  private double mySide3;
  
  public void setSides( double side1, double side2, double side3)
  {
    this.mySide1 = side1;
    this.mySide2 = side2;
    this.mySide3 = side3;
  }
  
  public double getSide1()
  {
    return mySide1;
  }
  public double getSide2()
  {
    return mySide2;
  }
  public double getSide3()
  {
    return mySide3;
  }

  private boolean isValid()
  {
    if(mySide3 < (mySide1+mySide2))
      if(mySide2 < (mySide1+mySide3))
        if(mySide1 < (mySide2+mySide3))
          return true;
 
      return false;
  }
 
  public boolean isEquilateral()
  {
    if(mySide1 == mySide2 && mySide2 == mySide3)
      return true;
    else
      return false;
  }

  public boolean isIsosceles()
  {
    if(this.isValid())
    {
      if(mySide1 == mySide2 || mySide1 == mySide3 || mySide3 == mySide2)
      {
        return true;
      }
      else
      {
        return false;
      }
    }
    else 
    {
      return false;
    }
  }

  public boolean isScalene()
  {
    if(mySide1 != mySide2 && mySide1 != mySide3 && mySide3 != mySide2)
      return true;
    else return false;
  }

  public double perimeter()
  {
    return (this.isValid()) ? (mySide1+mySide2+mySide3) : 0.0;
  }

  public double area()
  {
    double S = 0, area = 0;
    
    if(this.isValid())
    {
      S = (mySide1+mySide2+mySide3)/2;
      area = Math.sqrt(S*(S-mySide1)*(S-mySide2)*(S-mySide3));
    }
    else 
    {
      area = 0.0;
    }
    return area ;
  }


  public String toString()
  {
    return "Triangle with sides " + this.mySide1 +", "+ this.mySide2 +", and "+ this.mySide3;
  }
  
  public String getTypeString()
  {
    String triangleType = "";
    if(!this.isValid())
    {
      triangleType = "an invalid triangle";
    }
    if(this.isEquilateral())
    {
      triangleType = "an equilateral triangle";
    }
    else if(this.isIsosceles())
    {
      triangleType = "an isosceles triangle";
    }
    else if(this.isScalene())
    {
      triangleType = "an scalene triangle";
    }

    return triangleType;
  }
}
  
