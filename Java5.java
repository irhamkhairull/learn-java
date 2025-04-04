// Author: Irham
/* To determine leap year using method */
import java.util.*;
public class Java5 {
private static Scanner input = new Scanner (System.in);
 public static void main (String[] args) {
  int year = input.nextInt();
  if (year%4==0) {
   if (year%100==0)
    if (year%400==0)
     System.out.print("Leap year");
  }
 }
}