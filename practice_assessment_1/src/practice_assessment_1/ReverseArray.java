package practice_assessment_1;

import java.util.Arrays;

public class ReverseArray {
	
	public void reverse_of_array() {
		
		int arr[] = {1, 2, 3, 4, 5};

	     int n=arr.length;
	     for(int i=n-1; i>=0; i--) {
	    	 System.out.print(arr[i]+" ");
	     }
	}   

	public static void main(String[] args) {
		ReverseArray reverse = new ReverseArray();
		reverse.reverse_of_array();

	}

}
