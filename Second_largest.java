package array;

public class Second_largest {

	public static void main(String[] args) {
		
		int arr[]= {2,4,6,8,10};
		int first=arr[0];
		int second=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>first) {
				second=first;
				first=arr[i];
			}
			else if(arr[i]>second && arr[i]!= first) {
				
				second=arr[i];
			}
		}
	

	System.out.println("First largest : "+first+" "+"Second largest : "+second);
}
}