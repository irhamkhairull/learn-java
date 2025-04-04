// Author: Irham
/* To calculate the total purchase */
import java.util.*;
public class Java4 {
private static Scanner input = new Scanner (System.in);
 public static void main (String[] args) {
  double purchase, discount;
  System.out.print("Enter total purchase: RM");
  purchase=input.nextDouble();
  if(purchase>130)
   purchase=purchase-40;
  System.out.print("Please pay : RM" + purchase);
 }
} 