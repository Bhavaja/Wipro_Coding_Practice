package exception_package;

public class ExceptionHandling {

	public ExceptionHandling(String message) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		int[] nums = {1,2};
		
		try {
			System.out.println("Outer try block");
			
			try {
				System.out.println("Inner try block");
				int num1 = nums[3];
				System.out.println(num1);
			}
			catch(ArrayIndexOutOfBoundsException ai) {
				System.out.println("Array index out of bounds");		
			}
			
			int num2 = nums[1];
			System.out.println(num2);
		}
			
		catch(ArrayIndexOutOfBoundsException ai){
			System.out.println("Index out of bounds");
		}
		

	}
	
}


