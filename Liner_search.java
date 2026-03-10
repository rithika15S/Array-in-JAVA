// array=[5,4,6,8,9] target= 9 find the index of 9 if its there in a array

package array;

public class Liner_search {

	public static void main(String[] args) {
		
		int arr[]={5,4,6,8,9};
		
		int target=0;
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]==target) {
				
				System.out.println("target found at index no: "+i);
				return;
			}
		}
		
		System.out.println("Element not found ");
	}

}
