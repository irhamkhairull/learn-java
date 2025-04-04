// Author: Irham
/* To solve problem using array */
import java.util.*;
public class Java11 {
private static Scanner input = new Scanner (System.in);
 public static void main (String[] args) {
 double[] number={1,2,3,4,5,6,7,8,9,10};
  double total=0, avg;
  for (int i=0; i<number.length; i++) {
   total=total+number[i];
  }
  avg=total/number.length;
  System.out.println(total);
  System.out.print(avg);
 }
}