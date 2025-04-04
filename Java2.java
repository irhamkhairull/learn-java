// Author: Irham
/* To calculate the total and average of 10 numbers */
import java.util.*;
public class Java2 {
private static Scanner input = new Scanner (System.in);
 public static void main (String[] args) {
  int c=1, number, total=0, avg;
  while (c<11) {
   System.out.print("Enter your number: ");
   number=input.nextInt();
   total=total+number;
   c=c+1;
  }
  avg=total/10;
  System.out.println("The total is " + total);
  System.out.print("The average is " + avg);
 }
}