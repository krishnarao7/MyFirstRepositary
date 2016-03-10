package signal;

public class Green extends SignalState{

static Green greenInstance;
	
	private Green(Signal signal)
	{
		this.signal=signal;
	}

	public static Green createGreenSignal(Signal signal) {
		if(greenInstance==null)
			greenInstance=new Green(signal);
			System.out.println("Signal IS Orange...!");
			return greenInstance;
	}

	@Override
	void DisplayRed() {
		System.out.println("Cannot Go To Red..! Changing To Orange..!");
		DisplayOrange();
		
	}

	@Override
	void DisplayGreen() {
		System.out.println("Green Signal Is Already On..!");
		}

	@Override
	void DisplayOrange() {
		System.out.println("Signal Changed To Orange..!");
		signal.changeState(Orange.createOrangeSignal(signal));
	}


}
