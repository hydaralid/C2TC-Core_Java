package edu.atria.goshoppingapplication.framework;

public abstract class NormalAcc extends ShopAcc{
	private final float deliveryCharge;
	
	
	public NormalAcc(int accNo, String accNum, float charges, float deliveryCharge) {
		super(accNo, accNum, charges);
		this.deliveryCharge = deliveryCharge;
	}

	//getter
	public float getDeliveryCharge() {
		return deliveryCharge;
	}

	public void bookProduct(float deliveryCharge) {
		System.out.println("You're product is booked and the charges are: " + getCharges() + " and the delivery charge is: "+ deliveryCharge);
	}

	@Override
	public String toString() {
		return "NormalAcc [deliveryCharge=" + deliveryCharge + "]";
	}
	
}
