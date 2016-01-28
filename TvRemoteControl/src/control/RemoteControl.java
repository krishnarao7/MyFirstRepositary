package control;

public class RemoteControl implements ControlInterface {

	ControlInterface tv;
	public RemoteControl(ControlInterface tv) {
		super();
		this.tv = tv;
	}

	@Override
	public boolean powerOnOff() {
		return tv.powerOnOff();
		
	}

	@Override
	public int channelUp() {
		return tv.channelUp();
		
	}

	@Override
	public int channelDown() {
		return tv.channelDown();
	}

	@Override
	public int VolUp() {
		return tv.VolUp();		
	}

	@Override
	public int VolDown() {
		return tv.VolDown();
		
	}

}
