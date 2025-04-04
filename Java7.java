// Author: Irham
/* To calculate the average price */
import java.util.*;
public class Java7 {
private static Scanner input = new Scanner (System.in);
 public static void main (String[] args) {
  int roses, daisies, tulips;
  double totalPrice, totalFlower, avgPrice;
  System.out.print("Roses: ");
  roses=input.nextInt();
  System.out.print("Daisies: ");
  daisies=input.nextInt();
  System.out.print("Tulips: ");
  tulips=input.nextInt();
  totalPrice=(roses*2.5)+(daisies*3)+(tulips*4);
  totalFlower=roses+daisies+tulips;
  avgPrice=totalPrice/totalFlower;
  System.out.print("The average price is RM" + avgPrice);
 }
}