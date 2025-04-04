// Author: Irham
/* To determine the average */
import java.util.*;
public class Java9 {
private static Scanner input = new Scanner (System.in);
 public static void main (String[] args) {
  double[] number = new double [4];
  double total=0;
  for (int i=0; i<number.length; i=i+1) {
   number[i]=input.nextDouble();
   total=total+number[i];
  }
  double avg=total/number.length;
  System.out.print(avg); 
 }
}