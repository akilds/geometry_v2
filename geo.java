import java.util.*;
import java.lang.*;

public class geo
{
 public static void main(String[] args)
 {
  double x1, y1, x2, y2, length, b=2;
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter coordinates (x1, y1) : ");
  x1=sc.nextDouble();
  y1=sc.nextDouble();
  System.out.println("Enter coordinates (x2, y2) : ");
  x2=sc.nextDouble();
  y2=sc.nextDouble();
  length = Math.sqrt(Math.pow((x2-x1),b) + Math.pow((y2-y1),b));
  System.out.println("The length of the line joining the coordinates : "+length);
 }
}
