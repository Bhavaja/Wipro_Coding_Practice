package wrapper_classes;

public class WrapperClass {

	public static void main(String[] args) {
		
		//String to boolean
		String s = "True";
		System.out.println("String: "+s);
		boolean boolValue = Boolean.parseBoolean(s);
		System.out.println("String to boolean: " + boolValue);
		System.out.println();
		
		//primitive boolean to wrapper object
		boolean primBool = false;
		System.out.println("Primitive boolean: "+primBool);
		Boolean boolObj = Boolean.valueOf(primBool);
		System.out.println("Primitive boolean to wrapper object: "+boolObj);
		System.out.println();

		
		//wrapper object to primitive boolean
		Boolean booleanObj = true;
		System.out.println("Wrapper object: "+booleanObj);
		boolean primBoolean = booleanObj.booleanValue();
		System.out.println("Wrapper object to primitive boolean: "+primBoolean);

	}

}
