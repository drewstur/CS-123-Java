import java.util.*;

public class Ass6ID9250
{
  public static void main(String arg[])
  {
    GradeDistributionID9250 csClass = new GradeDistributionID9250();
    int currentGrade = 0, A = 0, B = 0, C = 0, D = 0, F = 0;
    Scanner keyboard = new Scanner(System.in);

    System.out.println("Enter grades ex.min 0,max 100 - enter negative number to stop: ");

    while(currentGrade >= 0)
    {
      currentGrade = keyboard.nextInt();

      if(currentGrade >= 90)
      {
        A++;
      }
      else if(currentGrade >= 80)
      {
        B++;
      }
      else if(currentGrade >= 70)
      {
        C++;
      }
      else if(currentGrade >= 60)
      {
        D++;
      }
      else if(currentGrade >= 0)
      {
        F++;
      }
    }
    
    csClass.setNumberOfAs(A);
    csClass.setNumberOfBs(B);
    csClass.setNumberOfCs(C);
    csClass.setNumberOfDs(D);
    csClass.setNumberOfFs(F);

    csClass.drawGraph();
  }
}