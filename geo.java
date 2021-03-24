import java.util.*;
import java.lang.*;

public class geo
{
  public static double x1, y1, x2, y2, length1, b=2;
  public static double a1, b1, a2, b2, length2;
  public static void calculation()
  {
   Scanner sc = new Scanner(System.in);
   System.out.println("Emter the coordines of line 1.");
   System.out.println("Enter coordinates (x1, y1) : ");
   x1=sc.nextDouble();
   y1=sc.nextDouble();
   System.out.println("Enter coordinates (x2, y2) : ");
   x2=sc.nextDouble();
   y2=sc.nextDouble();
   length1 = Math.sqrt(Math.pow((x2-x1),b) + Math.pow((y2-y1),b));
   String s1 = Double.toString(length1);
   System.out.println("The length of the line joining the coordinates : " + length1);
   System.out.println("Emter the coordines of line 2.");
   System.out.println("Enter coordinates (a1, b1) : ");
   a1=sc.nextDouble();
   b1=sc.nextDouble();
   System.out.println("Enter coordinates (a2, b2) : ");
   a2=sc.nextDouble();
   b2=sc.nextDouble();
   length2 = Math.sqrt(Math.pow((a2-a1),b) + Math.pow((b2-b1),b));
   String s2 = Double.toString(length2);
   System.out.println("The length of the line joining the coordinates : " + length2);
   int eq = s1.compareTo(s2);
   if(eq==0)
   {
    System.out.println("Length of line 1 and line 2 are equal");
   }
   else if(eq>0)
   {
    System.out.println("Length of line 1 is greater than Line 2");
   }
   else
   {
    System.out.println("Length of line 1 is smaller than Line 2");
   }
  }
 public static void main(String[] args)
 {
  calculation();
 }

}

