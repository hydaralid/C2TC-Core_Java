package edu.atria.goshoppingapplication.framework;

public abstract class ShopAcc {
	//private fields
	private int accNo;
	private String accNum;
	private float charges;
	
	//parameterized Constructor
	public ShopAcc(int accNo, String accNum, float charges) {
		super();
		this.accNo = accNo;
		this.accNum = accNum;
		this.charges = charges;
	}

	//getter
	public int getAccNo() {
		return accNo;
	}

	public float getCharges() {
		return charges;
	}

	public void setAccNum(String accNum) {
		this.accNum = accNum;
	}

	public void bookProduct(float charges) {
		System.out.println("You're product is booked and the charges are: "+ charges);
	}
	
	public void items(float charges) {
		System.out.println("You're items will be delivered soon and the charges are: " + charges);
	}

	@Override
	public String toString() {
		return "ShopFactory [accNo=" + accNo + ", accNum=" + accNum + ", charges=" + charges + "]";
	}

}
