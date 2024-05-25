package edu.atria.goshoppingapplication.framework;

public abstract class PrimeAcc extends ShopAcc{
	private boolean isPrime;
	private static final float deliveryCharge = 0;
	
	public PrimeAcc(int accNo, String accNum, float charges, boolean isPrime) {
		super(accNo, accNum, charges);
		this.isPrime = isPrime;
	}

	public static float getDeliverycharge() {
		return deliveryCharge;
	}

	//getter
	public boolean isPrime() {
		return isPrime;
	}

	public void bookProduct(float charges) {
		System.out.println("You're product is booked and the charges are: "+ charges + "and the delivery charge is: " + deliveryCharge);
	}

	@Override
	public String toString() {
		return "PrimeAcc [isPrime=" + isPrime + "]";
	}
}
