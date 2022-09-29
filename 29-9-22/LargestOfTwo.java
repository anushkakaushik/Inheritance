package CoreJava;
/*
Program: program to find largest of two numbers.
@author: Anushka kaushik
@date: 29th sept 2022
*/

import java.util.Scanner;
class LargestOfTwo {
	public static void main(String[] args) {
		// creating Scanner class
Scanner sc= new Scanner(System.in);
System.out.println(" enter 1st number:");
// taking value of 1st number from the user
int num1 = sc.nextInt();
System.out.println("enter 2nd number :");
int num2 = sc.nextInt();
if(num1>num2) {
	
	System.out.println(" Greatest number is :"+num1);
}
else 
{
	System.out.println("Greatest number is :" + num2);
}
}
}