package generics_pkg;

public class Box <T>{
	
	//rectangle variables
	private T length; 
	private T breadth;
	
	//circle variables
	private T radius; 
	
	//square variables
	private T side; 
	
	//triangle variables
	private T base; 
	private T height;
	
	//string variables
	private T text; 
			
	//constructor
	public Box() {
		int	length = 0;
		int	breadth = 0;
		double radius = 0;
		float side = 0;
		double base = 0;
		double height = 0;
		String text = null;
	}
	
	//rectangle getters and setters
	public void setLength(T length) {
		this.length = length;
	}
	public T getLength() {
		return length;
	}
	public void setBreadth(T breadth) {
		this.breadth = breadth;
	}
	public T getBreadth() {
		return breadth;
	}
			
	//circle getters and setters
	public void setRadius(T radius) {
		this.radius = radius;
	}
	public T getRadius() {
		return radius;
	}
		
	//square getters and setters
	public void setSide(T side) {
		this.side = side;
	}
	public T getSide() {
		return side;
	}
	
	//triangle getters and setters
	public void setBase(T base) {
		this.base = base;
	}
	public T getBase() {
		return base;
	}
	public void setHeight(T height) {
		this.height = height;
	}
	public T getHeight() {
		return height;
	}
			
	//string getters and setters
	public void setText(T text) {
		this.text = text;
	}
	public T getText() {
		return text;
	}
	
	public static void main(String[] args) {
		
		//area of rectangle using Integer wrapper class
		Box <Integer> rectangle = new Box<>();
		rectangle.setLength(4);
		rectangle.setBreadth(2);
		int length = rectangle.getLength();
		int breadth = rectangle.getBreadth();
		System.out.println("Area of rectangle: "+(length*breadth));
		
		//area of circle using Double wrapper class
		Box <Double> circle = new Box<>();
		circle.setRadius(4.0);
		double radius = circle.getRadius();
		System.out.println("Area of circle: "+(3.14*radius*radius));
		
		//perimeter of square using Float wrapper class
		Box <Float> square = new Box<>();
		square.setSide(3f);
		float side = square.getSide();
		System.out.println("Perimeter of square: "+(4*side));
		
		//area of triangle using Double wrapper class
		Box <Double> triangle = new Box<>();
		triangle.setBase(4.0);
		triangle.setHeight(2.0);
		double base = triangle.getBase();
		double height = triangle.getHeight();
		System.out.println("Area of triangle: "+(0.5*base*height));
		
		//Display the text using String class
		Box <String> str = new Box<>();
		str.setText("Above are the complete examples of Generic class");
		String text = str.getText();
		System.out.println(text);
		
	}
}
