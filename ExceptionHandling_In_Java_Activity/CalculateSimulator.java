package Exception;
/*
 * @author Arnab Kumar Hoodati
 */
public class CalculateSimulator {
	public static void main (String[] args) {
		TaxCalculator tc = new TaxCalculator();		//creating object of tax calculator
		System.out.println("Tax amount For Ron :" +tc.calculateTax("Ron", false, 34000));	//Test Case 1
		System.out.println("Tax amount For Tim :" +tc.calculateTax("Tim", true, 1000));		//Test Case 2
		System.out.println("Tax Amount For Jack :" +tc.calculateTax("Jack", true, 55000));	//Test Case 3
		System.out.println("Tax Amount For Null :" +tc.calculateTax(" ", true, 30000));		//Test Case 4
	}
}
