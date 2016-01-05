package ATM;

public class CardReader {
	Card mycard;
	Card usercard;
	public CardReader(Card mycard,Card usercard) {
		// TODO Auto-generated constructor stub
		this.mycard=mycard;
		this.usercard=usercard;
	}

	public boolean ValidateCard(Card mycard,Card usercard)
	{
		
		if(mycard.CardNo==usercard.CardNo && mycard.AccNo==usercard.AccNo && mycard.CardPin==usercard.CardPin)
		{
			return true;
		}
		
		else
		return false;
		
	}

	
}
