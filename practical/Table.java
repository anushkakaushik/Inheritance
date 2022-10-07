// WAP to print table of any number using for loop and take the input from the user.
package CoreJava;
import java.util.Scanner;
public class Table 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("enter number");
		int num = s.nextInt();
		//input from the user
		int m=0;
		System.out.println("the table of "+ num +"is");
		//printing the value of table
		for(int i=1;i<=10;i++)
		{
			m= i*num;
			System.out.println(num + "X" +i +"="+ m);
		}
	}

}
