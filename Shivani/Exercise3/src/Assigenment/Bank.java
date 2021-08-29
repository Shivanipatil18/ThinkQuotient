package Assigenment;

public class Bank extends Loan {
	@Override
	double CalculateInterest(int years, double ammount, int rate) {
		return (years*ammount*rate)/100;
	}


}
