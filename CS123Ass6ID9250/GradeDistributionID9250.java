import java.lang.Math;

public class  GradeDistributionID9250
{
  private int numA = 0, numB = 0, numC = 0, numD = 0, numF = 0;

   public void setNumberOfAs(int As)
   {
     this.numA = As;
   }

   public void setNumberOfBs(int Bs)
   {
     this.numB = Bs;
   }

   public void setNumberOfCs(int Cs)
   {
     this.numC = Cs;
   }

   public void setNumberOfDs(int Ds)
   {
     this.numD = Ds;
   }

   public void setNumberOfFs(int Fs)
   {
     this.numF = Fs;
   }

   public int getNumberOfAs()
   {
     return numA;
   }

   public int getNumberOfBs()
   {
     return numB;
   }

   public int getNumberOfCs()
   {
     return numC;
   }

   public int getNumberOfDs()
   {
     return numD;
   }

   public int getNumberOfFs()
   {
     return numF;
   }

   public int getTotalNumberOfGrades()
   {
     return (numA + numB + numC + numD + numF);
   }

   public double getPercentA()
   {

     return (double)numA / getTotalNumberOfGrades();
   }

   public double getPercentB()
   {
     return (double)numB / getTotalNumberOfGrades();
   }

   public double getPercentC()
   {
     return (double)numC / getTotalNumberOfGrades();
   }

   public double getPercentD()
   {
     return (double)numD / getTotalNumberOfGrades();
   }

   public double getPercentF()
   {
     return (double)numF / getTotalNumberOfGrades();
   }

   public void drawGraph()
   {
     System.out.println("");
     System.out.println("0   10   20   30   40   50   60   70   80   90   100%");
     System.out.println("|   |    |    |    |    |    |    |    |    |    |  ");
     System.out.println("**************************************************");

     
     for(int i = (int)Math.round(getPercentA() * 50); i > 0; i--)
     {
       System.out.print("*");
     }

     System.out.println(" A");

     for(int i = (int)Math.round(getPercentB() * 50); i > 0; i--)
     {
       System.out.print("*");
     }

     System.out.println(" B");

     for(int i = (int)Math.round(getPercentC() * 50); i > 0; i--)
     {
       System.out.print("*");
     }
     
     System.out.println(" C");
     
     for(int i = (int)Math.round(getPercentD() * 50); i > 0; i--)
     {
       System.out.print("*");
     }
     
     System.out.println(" D");
     
     for(int i = (int)Math.round(getPercentF() * 50); i > 0; i--)
     {
       System.out.print("*");
     }
     
     System.out.println(" F");
   }
}