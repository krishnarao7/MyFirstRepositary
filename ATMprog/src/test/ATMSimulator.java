package test;



public class ATMSimulator {
	
	
	public static void main(String[] args)
	{
		Account myAccount= new Account(12341234,"Tony",400000);
		Card myCard= new Card(100200300,1010,12341234);
		Atm myAtm=new Atm(500000);
		myAtm.connectBank(myAccount);
		
		
		
		//System.out.println(myAtm.getCash());
		Card userCard=new Card(100200300,1010,12341234);
		CardReader myReader=new CardReader(myCard,userCard);
			
		if (myReader.ValidateCard(myCard,userCard)==true)
			System.out.println("Card Accepted");
	
		Dispenser dispenser=new Dispenser(100000);
		Dispenser dispenser2=new Dispenser(200000);
		if (dispenser.WithdrawCash()==true)
		{
			if( myAccount.DeductAccount(dispenser.getWithdrawAmount())==true)
				System.out.println("Transaction Successfull");
		}
		System.out.println("Balance Is "+myAccount.getBalance());
		
		System.out.println("Cash In ATM: "+dispenser.getCash());
		//myAtm.updateCash(dispenser);
		System.out.println("Cash in Atm Class:"+myAtm.getCash() );
		
		if (dispenser2.WithdrawCash()==true)
		{
			if( myAccount.DeductAccount(dispenser2.getWithdrawAmount())==true)
				System.out.println("Transaction Successfull");
		}
		System.out.println("Balance Is "+myAccount.getBalance());
		
//System.out.println("Balance Is "+myAccount.getBalance());
		
		System.out.println("Cash In ATM: "+dispenser2.getCash());
		//myAtm.updateCash(dispenser2);
		System.out.println("Cash in Atm Class:"+myAtm.getCash() );

	}
	
}
