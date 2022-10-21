package CoreJava;

import java.util.Arrays;
import java.util.Scanner;

public class Arraysort2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter size ");
		int n = sc.nextInt();
		
		int arr[]=new int [n];
		System.out.println("enter elements");
//		System.out.println("array is");
		for (int i =0;i<n;i++){
	        arr[i]=sc.nextInt();
	        }
		for(int i:arr) {
			System.out.println(i+" ");
		}
		Arrays.sort(arr);
		System.out.println("sorted array is ");
		for(int i:arr) {
			System.out.println(i+" ");
	}

	}
}
