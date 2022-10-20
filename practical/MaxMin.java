// program to print maximum minimum of array
package CoreJava;

import java.util.*;
public class MaxMin
{
  public static void main(String[] args)
  {
       
       Scanner sc=new Scanner(System.in);
       int arr[]=new int[10];
       System.out.println("Enter elements in array");
       int min=Integer.MAX_VALUE;
       // holds the maximum value of integer
       int max=Integer.MIN_VALUE;
       // holds the minimum value of integer
       for(int i=0;i<=9;i++)
       {
         arr[i]=sc.nextInt();
         if(arr[i]<min)
        	 // comparison with minimum number
           {
           min=arr[i];
           }
         if(arr[i]>max)
        	 // compare with max number
         {
           max=arr[i];
         }
       }
       System.out.println("Maximum element is "+max);
       System.out.println("Minimum element is "+min);
       
       
  }
}