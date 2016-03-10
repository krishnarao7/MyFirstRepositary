package signal;

public abstract class SignalState {
	Signal signal;
	
	abstract void DisplayRed();
	abstract void DisplayGreen();
	abstract void DisplayOrange();
	
	void setSignal(Signal signal)
	{
		this.signal=signal;
	}
	
}
