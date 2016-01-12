package onlinePayment;

public class CreditCardPayment implements PaymentMethod {

	@Override
	public void makePayment(int price) {
		// TODO Auto-generated method stub
		System.out.println("Payment Of Rs. "+price+" Through Credit Card Successfull. Thank You!");
		
	}

}
