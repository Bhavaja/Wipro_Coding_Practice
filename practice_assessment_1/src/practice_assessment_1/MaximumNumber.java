package practice_assessment_1;

public class MaximumNumber {
	
	public int maximum(int[] arr) {
		int max = 0;
		int i = 0;
		while(i<arr.length-1) {
			if(arr[i]>max) {
				max = arr[i];
			}
			i++;
		}
		return max;
	}

	public static void main(String[] args) {
		MaximumNumber maxnum = new MaximumNumber();
		int[] arr = {4,8,7,1,3,11,13,22,45,5};
		System.out.println("Maximum number is: "+maxnum.maximum(arr));

	}

}
