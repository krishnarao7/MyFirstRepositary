package onlinePayment;

public class CODPayment implements PaymentMethod{

	@Override
	public void makePayment(int price) {
		// TODO Auto-generated method stub
		System.out.println("Payment Of Rs. "+price+" Through COD Successfull. Thank You!");
	}

}
