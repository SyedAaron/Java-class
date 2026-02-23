package fmr;
 
public class Bank {
	public static void loanDecision(int age, int salary, int creditScore) {
		if(age >= 21) {
			if(salary >= 25000) {
				if(creditScore >= 700) {
					System.out.println("Approved");
				}
				else {
					System.out.println("Rejected - Low credit score");
				}
			}
			else {
				System.out.println("Rejected - Low salary");
			}
		}
		else {
			System.out.println("Rejected - Under age");
			}
		}
	public static void main(String[] args) {
		loanDecision(25, 30000, 750);
	}
 
}
