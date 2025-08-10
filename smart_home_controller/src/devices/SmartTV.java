package devices;

public class SmartTV implements SmartDevice,Adjustable{
	
	private int volume;

	public SmartTV(int volume) {
		this.volume = volume;
	}
	
	public int getVolume() {
		return volume;
	}
	
	
	public void turnOn() {
		System.out.println("Smart TV is turned on");
	}
	
	public void turnOff() {
		System.out.println("Smart TV is turned off");
	}
	public void increase() {
		System.out.println("Volume is increased from "+volume+" to "+(volume+1));
	}
	public void decrease() {
		System.out.println("Volume is decreased from "+(volume+1)+" to "+volume);
	}

}
