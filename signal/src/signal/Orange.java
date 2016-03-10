package signal;

public class Orange extends SignalState{

	
	static Orange orangeInstance;
	
	private Orange(Signal signal)
	{
		this.signal=signal;
	}

	public static Orange createOrangeSignal(Signal signal) {
		if(orangeInstance==null)
			orangeInstance=new Orange(signal);
			System.out.println("Signal IS Orange...!");
			return orangeInstance;
	}

	@Override
	void DisplayRed() {
		System.out.println("Cannot Go To Red..! Changing To Green..!");
		DisplayGreen();
	}

	@Override
	void DisplayGreen() {
		System.out.println("Signal Changed to Green..!");
		signal.changeState(Green.createGreenSignal(signal));
	}

	@Override
	void DisplayOrange() {
		System.out.println("Orange Signal Is Already On..!");
	}
	
}
