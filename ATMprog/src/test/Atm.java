package test;

public class Atm {
	
 static double Cash;
 

	public Atm(double cash) {
		// TODO Auto-generated constructor stub
		Atm.Cash=cash;
	}
	
	
	public double getCash() {
		//System.out.println("Im here "+Cash);
		return Cash;
	}

	

	public void connectBank(Account myAccount) {
		// TODO Auto-generated method stub
		System.out.println("Connection Established");
	}
	

}
