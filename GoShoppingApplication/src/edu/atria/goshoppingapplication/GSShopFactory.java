package edu.atria.goshoppingapplication;

import edu.atria.goshoppingapplication.framework.NormalAcc;
import edu.atria.goshoppingapplication.framework.PrimeAcc;
import edu.atria.goshoppingapplication.framework.ShopFactory;

public class GSShopFactory extends ShopFactory{

	@Override
	public PrimeAcc getNewPrimeAccount(int accNo, String accNum, float charges, boolean isPrime) {
		GSPrimeAcc gsprime = new GSPrimeAcc(accNo, accNum, charges, isPrime);
		return gsprime;
	}

	@Override
	public NormalAcc getNewNormalAcc(int accNo, String accNum, float charges, float deliveryCharge) {
		GSNormalAcc gsnormal = new GSNormalAcc(accNo, accNum, charges, deliveryCharge);
		return gsnormal;
	}

	
}
