//WAP to print Reverse of numbers for example 10 9 8 7 6 5 4 3 2 1 using
//do-while loop and take the input from the user.
package CoreJava;
import java.util.Scanner;
public class Reverse {
//main class initlization
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number");
		// taking input from the user as integer type
		int n = s.nextInt();
		int rev=0;
		do{
			int rem = n%10;
			rev= rev*10+rem;
			n=n/10;
		}
		while(n>0);
	System.out.println("the you entered is : "+n);
System.out.println(" reverse is: "+rev);
	}

}
