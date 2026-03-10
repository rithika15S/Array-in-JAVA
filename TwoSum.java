//Two Sum Input:{2,7,8,10} Target =9 output=[0,1];

package array;

public class TwoSum {

	public static int[] main(String[] args) {
		// TODO Auto-generated method stub
		int arr3[]= {2,7,8,10};
		int target= 9;
		
		System.out.println(arr3);
		for(int i=0;i<arr3.length;i++) {
			for(int j=0;j<arr3.length;j++) {
				
				if(arr3[i]+arr3[j]==target) {
					
					return new int [] {arr3[i],arr3[j]};
				}
			}
		}
		return arr3;
	}

}
