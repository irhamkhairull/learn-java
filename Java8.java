// Author: Irham
/* To determine charge based on volume */
import java.util.*;
public class Java8 {
private static Scanner input = new Scanner (System.in);
 public static void main (String[] args) {
  double charge;
  System.out.print("Enter volume: ");
  int volume = input.nextInt();
  if(volume <= 20)
   charge = volume*0.4;
  else if(volume <= 40)
   charge = 8 + (volume-20)*0.2;
  else
   charge = 12 + (volume-40)*0.1;
  System.out.print("The total charge is " + charge);
 }
}