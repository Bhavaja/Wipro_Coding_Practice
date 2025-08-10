package devices;

public class SmartLight implements SmartDevice,Adjustable{
	
	private int brightness;
	
	public SmartLight(int brightness) {
		this.brightness = brightness;
	}
	
	public int getBrightness() {
		return brightness;
	}

	public void turnOn() {
		System.out.println("Smart light is turned on");
	}
	
	public void turnOff() {
		System.out.println("Smart light is turned off");
	}
	public void increase() {
		System.out.println("Brightness is increased from "+brightness+" to "+(brightness+1));
	}
	public void decrease() {
		System.out.println("Brightness is decreased from "+(brightness+1)+" to "+brightness);
	}

}
