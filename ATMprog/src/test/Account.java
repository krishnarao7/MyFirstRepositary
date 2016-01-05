package test;

public class Account {
	double AccNo;
	String AccHolderName;
	double Balance;
	
	public Account(double accNo, String accHolderName, double balance) {
		super();
		AccNo = accNo;
		AccHolderName = accHolderName;
		Balance = balance;
	}
	
	
	public boolean DeductAccount(double deductAmount)
	{
		if(Balance<deductAmount)
		{
			return false;
		}
		else
		{		
				Balance=Balance-deductAmount;
	   
		return true;
		 }
	}


	public double getBalance() {
		return Balance;
	}
}
