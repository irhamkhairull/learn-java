// Author: Irham
/* To solve problem using array */
import java.util.*;
public class Java10 {
private static Scanner input = new Scanner (System.in);
 public static void main (String[] args) {
  double[] number=new double[10];
  double total=0, avg;
  for (int i=0; i<number.length; i++) {
   number[i]=input.nextDouble();
   total=total+number[i];
  }
  avg=total/number.length;
  System.out.println(number[4]);
  System.out.print(avg);
 }
}