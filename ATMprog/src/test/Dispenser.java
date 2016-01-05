package test;

public class Dispenser extends Atm{
//double Cash;

public double getCash() {
	return Cash;
}
double WithdrawAmount;
//Atm myAtm;

public Dispenser(double withdrawAmount) {
	super(Cash);
	WithdrawAmount = withdrawAmount;
	//Cash=cash;
	}

public double getWithdrawAmount() {
	return WithdrawAmount;
}
/*
public void setCash() {
	System.out.println("Im here " +myAtm.getCash());
	Cash = myAtm.getCash();
}
*/
public boolean WithdrawCash()
{
	
	if(WithdrawAmount>Cash)
	{
			return false;
	}
	else
	{
		Cash=Cash-WithdrawAmount;
		//myAtm.getCash();
		return true;
		//updateCash();
		
	}
}

}
