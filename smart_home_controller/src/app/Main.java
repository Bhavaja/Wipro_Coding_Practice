package app;
import controller.DeviceController;

public class Main {

	public static void main(String[] args) {
		
		DeviceController device = new DeviceController();
		device.lightController();
		System.out.println();
		device.fanController();
		System.out.println();
		device.acController();
		System.out.println();
		device.tvtController();

	}

}
