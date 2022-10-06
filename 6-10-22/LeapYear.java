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
			// checks if the year is divisible by 400
	        {
	            check = true;
	        }
	        else if (year % 100 == 0)
			// this condition checks if the year entered by the user is divisible by 100
	        {
	            check = false;
	        }
	        else if(year % 4 == 0)
			// checks if the year gets remainder after modulo operator 4 
	        {
	            check = true;
	        }
	        else
	        {
	            check = false;
	        }
	        if(check)
			// prints leap year if check is  true
	        {
	            System.out.println("Year "+year+" is a Leap Year");
	        }
	        else
			// prints not a leap year if check is false
	        {
	            System.out.println("Year "+year+" is not a Leap Year");
	        }
	    }
	}

