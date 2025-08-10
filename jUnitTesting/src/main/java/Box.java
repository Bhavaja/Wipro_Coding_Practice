package main.java;

public class Box {
	
	public double circleArea(int radius) {
		return 3.14*radius*radius;
	}
	
	public double triangleArea(int base, int height) {
		return 0.5*base*height;
	}
	
	public int squareArea(int side) {
		return side*side;
	}
	
	public int rectangleArea(int length, int breadth) {
		return length*breadth;
	}
	
	public double simpleInterest(int principal,int time,int rate) {
		return (principal*time*rate)/100;
	}
	
	
	

}
