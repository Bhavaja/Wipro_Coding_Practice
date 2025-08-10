package devices;

public class SmartAC implements SmartDevice,Adjustable{
	
	private int temperature;

	public SmartAC(int temperature) {
		this.temperature = temperature;
	}
	
	public int getTemperature() {
		return temperature;
	}
	
	public void turnOn() {
		System.out.println("Smart AC is turned on");
	}
	
	public void turnOff() {
		System.out.println("Smart AC is turned off");
	}
	public void increase() {
		System.out.println("Temperature is increased from "+temperature+" to "+(temperature+1));
	}
	public void decrease() {
		System.out.println("Temperature is decreased from "+(temperature+1)+" to "+temperature);
	}


}
