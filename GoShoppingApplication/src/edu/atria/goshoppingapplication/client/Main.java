package edu.atria.goshoppingapplication.client;

import edu.atria.goshoppingapplication.GSNormalAcc;
import edu.atria.goshoppingapplication.GSPrimeAcc;
import edu.atria.goshoppingapplication.GSShopFactory;
import edu.atria.goshoppingapplication.framework.NormalAcc;
import edu.atria.goshoppingapplication.framework.PrimeAcc;
import edu.atria.goshoppingapplication.framework.ShopFactory;

public class Main {

	public static void main(String[] args) {
		ShopFactory sf = new GSShopFactory();
		PrimeAcc pa = new GSPrimeAcc(101, "Rahul",899.0f,true);
		NormalAcc na = new GSNormalAcc(121, "Ravi", 566.0f, 70.0f);
		pa.bookProduct(pa.getCharges());
		pa.toString();
		na.bookProduct(na.getDeliveryCharge());
		na.toString();
		
	}

}
