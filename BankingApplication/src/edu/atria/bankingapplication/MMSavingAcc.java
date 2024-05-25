package edu.atria.bankingapplication;

import edu.atria.bankingapplication.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc{
	private static final float MINBAL = 1000;
	
	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal, isSalaried);
		// TODO Auto-generated constructor stub
	}

	
	public float getMINBAL() {
		return MINBAL;
	}


	@Override
	public void withdraw(float MINBAL) {
		System.out.println("Dear user, the minimum balance in your savings account is: "+ getMINBAL());
	}


	@Override
	public String toString() {
		return "MMSavingAcc [getMINBAL()=" + getMINBAL() + ", isSalaried()=" + isSalaried() + ", toString()="
				+ super.toString() + ", getAccNo()=" + getAccNo() + ", getAccBal()=" + getAccBal() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}


	

	

	
}
