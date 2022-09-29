package CoreJava;
import java.util.Scanner;
 class Calculation {
public static  void main(String [] args) {
	// creating Scanner class
	Scanner sc= new Scanner(System.in);
	System.out.println(" enter first number:");
	// taking value of 1st number from the user
	int num1 = sc.nextInt();
	System.out.println("enter second number :");
	// taking value of 1st number from the user
	int num2 = sc.nextInt();
	
	System.out.println("enter values from 1-4");
	// taking value of operator from the user
	int operator =sc.nextInt();
	if(operator==1) {
		//addition
		System.out.println("sum is :"+(num1+num2));
	}
	if(operator==2) {
		// subtraction
		System.out.println("diffrence  is :"+(num1-num2));
	}
	if(operator==3) {
		//multiplication
		System.out.println("multiplication is :"+(num1*num2));
	}
	if(operator==4) {
		//division
		System.out.println("division is :"+(num1/num2));
	}
	
}
}
