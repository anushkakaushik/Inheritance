//WAP to test whether the person is applicable to give vote using If-Else
package CoreJava;
import java.util.Scanner;
public class Vote {
public static void main(String [] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("enter age");
int age = s.nextInt();
System.out.println("your age is:" +age);
// checks if we are eligible for voting or not 
System.out.println((age>=18? "eligible": "not eligible"));
}
}
