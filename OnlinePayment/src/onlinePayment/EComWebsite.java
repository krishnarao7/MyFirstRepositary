
package onlinePayment;

public class EComWebsite {
	PaymentMethod pm;
	int price;
	
boolean choosePaymentMethod(int i) 
{
	if (i==1) 
		pm=new DebitCardPayment();
	else if (i==2)
		pm=new CreditCardPayment();
	else if (i==3)
		pm= new NetBanking();
	else if (i==4)
		pm=new CODPayment();
	else
		return false;
	
	return true;
	}

void makePayment(int price)
{
	pm.makePayment(price);
}

}
