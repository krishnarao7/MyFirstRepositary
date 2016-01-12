package onlinePayment;

public class NetBanking implements PaymentMethod {

	@Override
	public void makePayment(int price) {
		System.out.println("Payment Of Rs. "+price+" Through Net Banking Successfull. Thank You!");
	}

}
