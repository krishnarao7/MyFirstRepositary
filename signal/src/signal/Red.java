package signal;



public class Red extends SignalState{

	
	private static Red redInstance;
	
	private Red(Signal signal)
	{
		setSignal(signal);
	}
	
	public static Red createRedSignal(Signal signal)
	{
		if(redInstance==null)
			redInstance=new Red(signal);
			System.out.println("Signal IS Red...!");
			return redInstance;
	}
	
	@Override
	void DisplayRed() {
		System.out.println("Red Signal Is Already On..!");
		}

	@Override
	void DisplayGreen() {
		System.out.println("Cannot Go To Green..! Changing To Orange..!");
		DisplayOrange();
		
	}

	@Override
	void DisplayOrange() {
		System.out.println("Signal Changed To Orange..!");
		signal.changeState(Orange.createOrangeSignal(signal));
	}
	

}
