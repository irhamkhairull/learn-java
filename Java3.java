// Author: Irham
/* To calculate the total allowance based on hours of duty */
import java.util.*;
public class Java3 {
private static Scanner input = new Scanner (System.in);
 public static void main (String[] args) {
  System.out.print("Enter total hour of duty: ");
  int hour = input.nextInt();
  int total = 8*hour;
  System.out.print("The total allowance is RM" + total);
 }
}