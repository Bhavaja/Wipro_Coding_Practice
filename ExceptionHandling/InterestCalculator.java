package oops_package;

/*Project :
Banking System – Interest, Loan EMI, Currency Conversion.
 
Define 3 interfaces:
- InterestCalculator – calculates simple interest.
- EMICalculator – calculates monthly EMI for a loan.
- CurrencyConverter – converts from INR to USD.
 
Each interface has a method with a calculation 
inside an anonymous class implementation.*/

public interface InterestCalculator {
	
	int principal = 12000;
	double rate = 3.8;
	int years = 5;
	
	
	public void calculate_simple_interest();
	

}
