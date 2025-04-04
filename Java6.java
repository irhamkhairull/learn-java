// Author: Irham
/* To calculate the total price */
import java.util.*;
public class Java6 {
private static Scanner input = new Scanner (System.in);
 public static void main (String[] args) {
  int smallBottle, largeBottle;
  double smallPrice, largePrice, price, tax, totalPrice;
  System.out.print("Enter amount of small bottle: ");
  smallBottle=input.nextInt();
  System.out.print("Enter amount of large bottle: ");
  largeBottle=input.nextInt();
  smallPrice=15*smallBottle;
  largePrice=30*largeBottle;
  price=smallPrice+largePrice;
  tax=0.10*price;
  totalPrice=price+tax;
  System.out.print("The total price is RM" + totalPrice);
 }
}