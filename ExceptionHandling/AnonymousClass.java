package oops_package;
import java.lang.Math;

public class AnonymousClass {

	public static void main(String[] args) {
		
		//Anonymous class for  interface InterestCalculator
		InterestCalculator interest = new InterestCalculator() {
			
			public void calculate_simple_interest() {
				double simple_interest = ((principal*years*rate)/100);
				System.out.println("Simple interest: "+simple_interest);
			}
		};
		interest.calculate_simple_interest();
		
		//Anonymous class for  interface EMICalculator
		EMICalculator emi = new EMICalculator() {
			
			public void calculate_monthly_emi() {
				double monthly_emi = (principal*rate*Math.pow(1+rate,months))/((Math.pow(principal,rate))-1);
				System.out.println("Monthly EMI: "+monthly_emi);
			}
		};
		emi.calculate_monthly_emi();
		
		//Anonymous class for  interface CurrencyConverter
		CurrencyConverter currency = new CurrencyConverter() {
			
			public void convert_inr_to_usd() {
				double currency_USD = currency_INR * 0.012;
				System.out.println("20000 INR in USD: "+currency_USD);
			}
		};
		currency.convert_inr_to_usd();
		

	}

}
