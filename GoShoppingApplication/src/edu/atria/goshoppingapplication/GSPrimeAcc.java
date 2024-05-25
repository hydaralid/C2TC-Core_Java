package edu.atria.goshoppingapplication;

import edu.atria.goshoppingapplication.framework.PrimeAcc;

public class GSPrimeAcc extends PrimeAcc{
	
	public GSPrimeAcc(int accNo, String accNum, float charges, boolean isPrime) {
		super(accNo, accNum, charges, isPrime);
		// TODO Auto-generated constructor stub
	}

	
	public void bookProduct(float charges) {
		System.out.println("Dear Prime user your product is booked and the charges are: "+ charges + " and the delivery charge is: " + getDeliverycharge());
	}


	@Override
	public String toString() {
		return "GSPrimeAcc [isPrime()=" + isPrime() + ", toString()=" + super.toString() + ", getAccNo()=" + getAccNo()
				+ ", getCharges()=" + getCharges() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	
	
}
