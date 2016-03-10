package signal;



public class Signal {
	SignalState curState;
	
	
	
	public Signal() {
		System.out.println("Signal Lamp Is Created");
		this.curState = Red.createRedSignal(this);
	}

	void changeState(SignalState curState)
	{
		this.curState=curState;
	}
	
	void DisplayRed() {
		System.out.println("Putting Red On...!");
		curState.DisplayRed();
		}

	
	void DisplayGreen() {
		System.out.println("Putting Green On...!");
		curState.DisplayGreen();
	}

	
	void DisplayOrange() {
		System.out.println("Putting Orange On...!");
		curState.DisplayOrange();
	}
	
	
	
}
