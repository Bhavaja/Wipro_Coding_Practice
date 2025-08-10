package oops_package;

public class PayPalPayment {
	
	public void makePayment() {
		Number num = new Integer(2000);
		System.out.println("PayPal payment of $"+num.doubleValue()+" processed");
	}

}
