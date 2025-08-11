package oops_package;

public class Car {
	
	private String model;
	private int launch_year;
	
	//constructor
	public Car() {
		System.out.println("Car for trial run");
	}
	
	//parameterized constructor
	public Car(String model, int launch_year) {
		this.model = model;
		this.launch_year = launch_year;
	}
	
	//getters and setters
	public String get_model() {
		return model;
	}
	public void set_model(String model) {
		this.model = model;
	}
	
	public int get_year() {
		return launch_year;
	}
	public void set_year(int launch_year) {
		this.launch_year = launch_year;
	}
	
	@Override
	public String toString() {
		return "Model : " +model+ " and Launch year : " +launch_year;	
	}

}
