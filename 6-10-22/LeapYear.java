//WAP to check for leap year . Take input from user
package CoreJava;
import java.util.Scanner;
class LeapYear
{
		public static void main(String [] args)
	    {
	        Scanner s = new Scanner(System.in);
	        //takes input year as an integer
	        System.out.print("Enter  year:");
	        int year = s.nextInt();
	        boolean check = false;
	        if(year % 400 == 0)
	        {
	            check = true;
	        }
	        else if (year % 100 == 0)
	        {
	            check = false;
	        }
	        else if(year % 4 == 0)
	        {
	            check = true;
	        }
	        else
	        {
	            check = false;
	        }
	        if(check)
	        {
	            System.out.println("Year "+year+" is a Leap Year");
	        }
	        else
	        {
	            System.out.println("Year "+year+" is not a Leap Year");
	        }
	    }
	}

