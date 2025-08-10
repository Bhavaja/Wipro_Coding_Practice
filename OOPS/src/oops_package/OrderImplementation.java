package oops_package;

public class OrderImplementation {

	public static void main(String[] args) {
		
		PhysicalProductOrder physical = new PhysicalProductOrder("11A");
		physical.process_order();
		physical.print_order_summary();
		
		Order digital = new DigitalProductOrder("12B");
		digital.process_order();
		digital.print_order_summary();
		
		Order service = new ServiceOrder("13C");
		service.process_order();
		service.print_order_summary();

	}

}
