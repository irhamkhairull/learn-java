// Author: Irham
/* To print the selected message based on the given options */
import java.util.*;
public class Java1 {
private static Scanner input = new Scanner (System.in);
 public static void main (String[] args) {
  System.out.println("what's your cgpa?");
  String state1 = input.next();
  String state2 = ("4.00");
  if (state1.equals(state2)) 
   System.out.print("congrats, you get the fee exemption");
  else
   System.out.print("congrats, you may work harder next time"); 
 }
}