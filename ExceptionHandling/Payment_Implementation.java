package oops_package;

public class Payment_Implementation {
	
	public static void main(String[] args) {
		
		CreditCardPayment credit = new CreditCardPayment();
		credit.makePayment();
		
		PayPalPayment paypal = new PayPalPayment();
		paypal.makePayment();
			
	}

}
