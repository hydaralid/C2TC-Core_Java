package edu.atria.goshoppingapplication.framework;

public abstract class ShopFactory {
	public abstract PrimeAcc getNewPrimeAccount(int accNo, String accNum, float charges ,boolean isPrime);
	public abstract NormalAcc getNewNormalAcc(int accNo, String accNum, float charges, float deliveryCharge);
}
