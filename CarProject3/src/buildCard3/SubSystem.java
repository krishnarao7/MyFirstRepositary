package buildCard3;

public class SubSystem {
	int SSprice;

	void addPart(Parts p)
	{
		SSprice+=p.price;
	}


	public int getESprice() {
		return SSprice;
	}
}
