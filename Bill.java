package fmr;
 
public class hello {
 
	public static double calculateBill(double amount, boolean isFirstOrder) {
		double finalAmount;
		if(amount < 500) {
			finalAmount = amount;
		}
		else if(amount >= 500 && amount < 1500) {
			finalAmount = amount - (amount * 0.05);
		}
		else {
			finalAmount = amount - (amount * 0.10);
		}
		if(isFirstOrder) {
			finalAmount = finalAmount - (finalAmount *0.02);
		}
		return finalAmount;
	}
	public static void main(String[] args) {
		System.out.println(calculateBill(700,true));
 
	}
 
}
