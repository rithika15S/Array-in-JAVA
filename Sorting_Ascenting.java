package array;

public class Sorting_Ascenting {

	public static void main(String[] args) {
	     
		  int arr[]= {10,4,2,5,6,11};
		  
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

	}

}
