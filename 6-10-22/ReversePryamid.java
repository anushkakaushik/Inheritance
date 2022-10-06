package CoreJava;
import java.util.Scanner;

public class ReversePryamid 
{

	public static void main (String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("enter number");
	    // Size of the pyramid
		int num = s.nextInt();
	    int i, j;
	      
	    // Outer loop handle the number of rows
	    for(i = num; i >= 1; i--)
	    {
	          
	        // Inner loop print space
	        for(j = i; j < num; j++)
	        {
	            System.out.print(" ");
	        }
	          
	        // Inner loop print star
	        for(j = 1; j <= (2 * i - 1); j++)
	        {
	            System.out.print("*");
	        }
	          
	        // Ending line after each row
	        System.out.println("");
	    } 
	}
	}


