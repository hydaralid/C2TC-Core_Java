package edu.atria.goshoppingapplication;

import edu.atria.goshoppingapplication.framework.NormalAcc;

public class GSNormalAcc extends NormalAcc{
	
	
	public GSNormalAcc(int accNo, String accNum, float charges, float deliveryCharge) {
		super(accNo, accNum, charges, deliveryCharge);
		// TODO Auto-generated constructor stub
	}

	public void bookProduct(float deliveryCharge) {
		System.out.println("Dear user your product is booked and the charges are: "+ getCharges() + " and the delivery charge is: " + getDeliveryCharge());
	}

	@Override
	public String toString() {
		return "GSNormalAcc [getDeliveryCharge()=" + getDeliveryCharge() + ", toString()=" + super.toString()
				+ ", getAccNo()=" + getAccNo() + ", getCharges()=" + getCharges() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	
	
}
