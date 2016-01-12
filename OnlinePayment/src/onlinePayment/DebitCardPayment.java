package onlinePayment;

public class DebitCardPayment implements PaymentMethod {

	@Override
	public void makePayment(int price) {
		// TODO Auto-generated method stub
		System.out.println("Payment Of Rs. "+price+" Through Debit Card Successfull. Thank You!");
	}

}
