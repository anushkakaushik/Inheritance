package CoreJava;
import java.util.Scanner;
 class BitwiseOperator {
public static void main (String []  args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter first value :");
	int num1 = sc.nextInt();
	System.out.println("Enter second value :");
	int num2 = sc.nextInt();
	
	// 8 2 1
	//bitwise AND operator
	System.out.println("num1&num2" + num1 &num2);
	//0 1 0 1
		//0 1 1 0
		//-------
		//0 1 0 0=4
	//bitwise or operator
		System.out.println("num1|num2" +num1 |num2);
		//0101
		//0101
		//-------
		//0111=7
		//bitwise xor operator
		System.out.println("num1^num2" +num1 ^num2);
		//
		//bitwise not operator
		System.out.println("num1" + ~num1);
}
}
