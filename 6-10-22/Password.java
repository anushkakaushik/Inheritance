//WAP to check condition for checking the correct password using if-else . Take input from user
package CoreJava;
import java.util.Scanner;
public class Password {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter  your password");
		//takes password from the user as input
		int pass = s.nextInt();
		if(pass==4464) 
			//checks if the user have entered the correct password
		{
			System.out.println("correct password");
		}
		else {
			System.out.println("oops wrong password try again");
		}

	}

}
