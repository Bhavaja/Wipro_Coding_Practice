package list_pkg;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class CustomerList {

	public static void main(String[] args) {
		
		List<Customer> customerList = new ArrayList<>();
		
		customerList.add(new Customer("C001","Max","8976543210","Hyderabad"));
		customerList.add(new Customer("C002","Kevin","6783426187","Chennai"));
		customerList.add(new Customer("C003","John","9876543210","Banglore"));
		customerList.add(new Customer("C004","Bob","7654321890","Pune"));
		customerList.add(new Customer("C005","Charlie","8328278058","Mumbai"));
		
		//Collections.sort(customerList);
		
		//Display customer details
		System.out.println("Customer details:");	
		Iterator<Customer> iterator1 = customerList.iterator();
		while(iterator1.hasNext()) {
			Customer customer = iterator1.next();
			System.out.println(customer);
			}
		System.out.println();
		
		//remove element at index 3 and display details
		System.out.println("Customer details after removing element at index 3:");
		customerList.remove(3);
		for(Customer customer : customerList) {
			System.out.println(customer);
		}
		System.out.println();
		
		//search for id C003
		Iterator<Customer> iterator2 = customerList.iterator();
		String searchId = "C003";
		if(iterator2.hasNext()) {
			boolean found = false;
			for(Customer customer : customerList) {
				if(customer.getId() == searchId) {
					System.out.println("Customer details with id "+searchId+":");
					System.out.println("Name: "+customer.getName()+" , Location: "+customer.getLocation());
					found = true;
					break;
				}
			}
			if(!found) {
				System.out.println("Customer "+searchId+" is not found in the list.");
			}
			
		}
			
	}

}
