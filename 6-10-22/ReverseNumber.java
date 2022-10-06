//WAp to find reverse of a number
package CoreJava;
import java.util.Scanner;
 class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);
System.out.println("enter number");
//takes input from the number 
int num = s.nextInt();
int rev=0;
while(num!=0) {
	int rem = num%10;
	//remainder 
	rev  = rem +rev*10;
	num=num/10;
}
// prints the reverse value 
System.out.println("the reverse is "+rev);
	}

}
