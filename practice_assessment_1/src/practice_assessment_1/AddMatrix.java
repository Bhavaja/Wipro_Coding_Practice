package practice_assessment_1;

import java.util.Arrays;

public class AddMatrix {
	
	public void add_matrices() {
		
		int rows = 2;
		int cols = 3;
		int[][] matrix1 = {{1,2,3},{4,5,6}};
		int[][] matrix2 = {{4,5,6},{7,8,9}};
		
		int[][] sum = new int[rows][cols];
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				sum[i][j] = matrix1[i][j] + matrix2[i][j];
			}	
		}
		
		for(int[] row:sum) {
			for(int value:row) {
				System.out.print(value+" ");
			}		
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		
		AddMatrix add = new AddMatrix();
		add.add_matrices();
		

	}

}
