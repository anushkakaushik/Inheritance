
/*WAP to demonstrate nested if statement of 5 subjects.
 * the person who gets above 60% will be passed otherwise 
 * failed.output should be like:Enter your name,Enter marks
 *  for the 5 subjects. */
package CoreJava;

import java.util.Scanner;

public class IfELse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your name");
		String name = sc.nextLine();
		System.out.println("Enter first value :");
		int num1 = sc.nextInt();
		System.out.println("Enter second value :");
		int num2 = sc.nextInt();
		System.out.println("Enter third value :");
		int num3 = sc.nextInt();
		System.out.println("Enter fourth value :");
		int num4 = sc.nextInt();
		System.out.println("enter fift value: ");
		int num5 = sc.nextInt();
		int percentage = ((num1+num2+num3+num4+num5)/500)*100;
		if(percentage>=60) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
	}

}
