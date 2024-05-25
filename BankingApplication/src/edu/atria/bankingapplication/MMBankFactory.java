package edu.atria.bankingapplication;

import edu.atria.bankingapplication.framework.BankFactory;
import edu.atria.bankingapplication.framework.CurrentAcc;
import edu.atria.bankingapplication.framework.SavingAcc;

public class MMBankFactory extends BankFactory{

	@Override
	public SavingAcc getNewSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		MMSavingAcc mmsaving = new MMSavingAcc(accNo, accNm, accBal, isSalaried);
		return mmsaving;
	}

	@Override
	public CurrentAcc getNewCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		MMCurrentAcc mmprime = new MMCurrentAcc(accNo, accNm, creditLimit, creditLimit);
		return mmprime;
	}

	
}
