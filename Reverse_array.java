//Reverse an array 

package array;

import java.util.Scanner;

public class Reverse_array {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of the array");
		
		int size= sc.nextInt();
		int arr[]=new int[size];
		
		System.out.println("Enter the elements of the array");
		
		for(int i= 0;i<size;i++) {
			
			arr[i]=sc.nextInt();
		}
		// before reverse an array
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(+arr[i]+"   ");
		}
		
		System.out.println("  ");
       // after reversing
		
		for(int i=arr.length-1;i>=0;i--) {
			
			
			System.out.print(+arr[i]+" ");
		}
		
		sc.close();
	}
	

}
