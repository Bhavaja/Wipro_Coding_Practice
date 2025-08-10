package practice_assessment_1;

public class SwapValues {
	
	public void swapping() {
		
		int a = 10;
		int b = 30;
		
		System.out.println("Before swapping");
		System.out.println("a = "+a+" b = "+b);
		
		a = a+b;
		b = a-b;
		a = a-b;
		
		System.out.println("After swapping");
		System.out.println("a = "+a+" b = "+b);
	}

	public static void main(String[] args) {
		SwapValues swap = new SwapValues();
		swap.swapping();
		
	}

}
