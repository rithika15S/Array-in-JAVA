package array;

import java.util.Scanner;

public class Sorting_decenting {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size= sc.nextInt();
		
		 int arr[]= new int [size];
		 
		 System.out.println("Enter the elements for array :");
		 
		 for(int i=0;i<size;i++) {
			 
			 arr[i]=sc.nextInt();
		 }
		  
		  for(int i=0;i<arr.length-1;i++)
		  for(int j=0;j<arr.length-i-1;j++){
			  
			  if(arr[j]<arr[1+j]) 
			  {
				  
				  int temp= arr[j];
				  arr[j]=arr[j+1];
				  arr[j+1]=temp;
			  }
		  }
			 for(int i =0;i<arr.length;i++) {
				 
				 System.out.print(arr[i]+" ");
			 }
sc.close();
	}

}
