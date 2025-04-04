// Author: Irham Irfan
/* To find whether the CGPA can be found or not based on all 10 CGPAs */

import java.util.*;
public class Java12 {
private static Scanner input = new Scanner (System.in);
 public static void main (String[] args) {
 
  double[] CGPA=new double[10];
  for (int i=0; i<CGPA.length; i++) {
   System.out.print("Enter CGPA " + (i+1) + ": ");
   CGPA[i]=input.nextDouble();
  }
  
  System.out.print("Enter CGPA that you are searching for: ");
  double searchCGPA=input.nextDouble();
  int found=0;
  for (int i=0; i<CGPA.length; i++) {
   if (searchCGPA==CGPA[i]) {
    System.out.println("The CGPA has been found at index: " + i);
    found=found+1;
   } 
  }
  
  if (found==0)
   System.out.print("The CGPA has not been found at all"); 
   
 }
}