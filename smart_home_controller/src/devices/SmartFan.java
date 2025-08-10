package devices;

public class SmartFan implements SmartDevice,Adjustable{
	
	private int speed;
	
	public SmartFan(int speed) {
		this.speed = speed;
	}
	
	public int getSpeed() {
		return speed;
	}
	
	public void turnOn() {
		System.out.println("Smart fan is turned on");
	}
	
	public void turnOff() {
		System.out.println("Smart fan is turned off");
	}
	public void increase() {
		System.out.println("Speed is increased from "+speed+" to "+(speed+1));
	}
	public void decrease() {
		System.out.println("Speed is decreased from "+(speed+1)+" to "+speed);
	}


}
