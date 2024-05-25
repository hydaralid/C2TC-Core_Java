package edu.atria.bankingapplication.framework;

public abstract class BankAcc {
	private int accNo;
	private String accNm;
	private float accBal;
	
	public BankAcc(int accNo, String accNm, float accBal) {
		super();
		this.accNo = accNo;
		this.accNm = accNm;
		this.accBal = accBal;
	}

	
	
	public int getAccNo() {
		return accNo;
	}

	public float getAccBal() {
		return accBal;
	}

	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}
	
	public void withdraw(float accBal) {
		System.out.println("Dear user, the balance in your account after withdrawn is: " + accBal);
	}
	
	public void deposit(float accBal) {
		System.out.println("Dear user, the balance in your account after deposit is: " + accBal);
	}

	@Override
	public String toString() {
		return "BankAcc [accNo=" + accNo + ", accNm=" + accNm + ", accBal=" + accBal + "]";
	}
	
	
	
}
