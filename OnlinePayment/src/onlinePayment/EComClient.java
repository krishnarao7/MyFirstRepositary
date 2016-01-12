package onlinePayment;

import java.util.Scanner;

public class EComClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EComWebsite flipkart= new EComWebsite();
		Item item=new Item(500);
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("1. Debit Card \n2. Credit Card \n3. Net Banking \n4. COD Payment");
		int input=scanner.nextInt();
		flipkart.choosePaymentMethod(input);
	flipkart.makePayment(item.getPrice());
	
	
	}

}
