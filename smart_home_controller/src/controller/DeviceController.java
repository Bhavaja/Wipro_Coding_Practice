package controller;

import java.util.Scanner;

import devices.*;

public class DeviceController {
	Scanner sc = new Scanner(System.in);
	
	SmartLight light = new SmartLight(3);
	SmartFan fan = new SmartFan(4);
	SmartAC ac = new SmartAC(24);
	SmartTV tv = new SmartTV(20);
	
	public void lightController() {
		System.out.print("Enter the status of smart light: ");
		String lightStatus = sc.next();
		if(lightStatus.equalsIgnoreCase("on")) {
			light.turnOn();
			light.increase();
			light.decrease();
		}
		else {
			light.turnOff();
		}
	}
	
	public void fanController() {
		System.out.print("Enter the status of smart fan : ");
		String fanStatus = sc.next();
		if(fanStatus.equalsIgnoreCase("on")) {
			fan.turnOn();
			fan.increase();
			fan.decrease();
		}
		else {
			fan.turnOff();
		}
		
	}
	
	public void acController() {
		System.out.print("Enter the status of smart ac: ");
		String acStatus = sc.next();
		if(acStatus.equalsIgnoreCase("on")) {
			ac.turnOn();
			ac.increase();
			ac.decrease();
		}
		else {
			ac.turnOff();
		}		
	}
	
	public void tvtController() {
		System.out.print("Enter the status of smart tv: ");
		String tvStatus = sc.next();
		if(tvStatus.equalsIgnoreCase("on")) {
			tv.turnOn();
			tv.increase();
			tv.decrease();
		}
		else {
			tv.turnOff();
		}
	}

}
