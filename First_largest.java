//Find the first largest values

package array;

public class First_largest {

	public static void main(String[] args) {
		  int arr[] = {100,400,40,20,50};

	        int first = arr[0];

	        for(int i=0;i<arr.length;i++) {

	            if(arr[i] > first) {

	                first = arr[i];

	            }
	        }

	        System.out.println("First Largest Value: " + first);
	    }

	}