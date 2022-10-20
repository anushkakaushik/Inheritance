//program to print even number of array elements
package CoreJava;
import java.util.Scanner;
public class EvenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s= new Scanner (System.in);
System.out.println("Enter the number of elemnts");
int num = s .nextInt();


int arr[]= new int [num];
if(num %2==0) {
	// if the number of elements are even the it will take input 
	System.out.println("enter the elements");
	for (int i=0;i<num;i++) {
		arr[i]= s.nextInt();
		
	}
	for (int i=0;i<num ;i++) {
		System.out.println(arr[i]);
	}
	// checks the input numbers are even or not 
	
}
else {
	System.out.println("enter even number of elements");
}
	}

}
