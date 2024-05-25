package edu.atria.bankingapplication.client;

import edu.atria.bankingapplication.MMBankFactory;
import edu.atria.bankingapplication.MMCurrentAcc;
import edu.atria.bankingapplication.MMSavingAcc;
import edu.atria.bankingapplication.framework.BankFactory;
import edu.atria.bankingapplication.framework.CurrentAcc;
import edu.atria.bankingapplication.framework.SavingAcc;

public class Main {

	public static void main(String[] args) {
		BankFactory bf = new MMBankFactory();
		SavingAcc sa = new MMSavingAcc(103, "Rahul", 5000, false);
		CurrentAcc ca = new MMCurrentAcc(104, "Ravi", 60000, 100000);
		sa.withdraw(sa.getAccBal());
		sa.toString();
		sa.deposit(sa.getAccBal());
		sa.toString();
		ca.withdraw(ca.getCreditLimit());
		ca.toString();
		ca.deposit(ca.getAccBal());
		ca.toString();
		

	}

}
