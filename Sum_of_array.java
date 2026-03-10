
// Add the two array's Sum
package array;


import java.util.Scanner;

public class Sum_of_array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
          int arr[]= new int[size];
          int sum=0;
          System.out.println("Enter the elements for 1st array");
          
          for(int i=0;i<size;i++){
        	  arr[i]=sc.nextInt();
          }
          for(int i=0;i<arr.length;i++) {
			
			sum+=arr[i];
		}
          System.out.println("Enter the size of the array2");
  		int size2=sc.nextInt();
            int arr2[]= new int[size2];
            int sum2=0;
            System.out.println("Enter the elements for 2st array");
            
            for(int i=0;i<size2;i++){
          	  arr2[i]=sc.nextInt();}
            
                for(int i=0;i<arr2.length;i++) {
			
			sum2+=arr2[i];
		}
System.out.println(sum+sum2);
System.out.println();

sc.close();

	}

}
