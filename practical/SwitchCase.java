//WAP to demonstrate on switch case using input from the user.
package CoreJava;
import java.util.Scanner;
public class SwitchCase {
//main class initialization
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		//input case from user
		System.out.println("select any number from  1-3");
		int c = s.nextInt();
		//take all cases as inputs
		switch(c) {
		case 1:
		System.out.println("hello");
		break;
		case 2:
			System.out.println("hii");
			break;
		case 3:
			System.out.println("namaste ");
			break;
			//default value
			default :
				System.out.println("select from 1-3");
		}
		//end of switch case

	}

}
