package control;

public class Tv implements ControlInterface {
boolean power=false;
int volume;
int channel;
public Tv(int volume, int channel) {
	this.volume = volume;
	this.channel = channel;
}

public Tv(){};


@Override
public boolean powerOnOff() {
	if (power==true)
		power=false;
	else if(power==false)
		power=true;
	return power;
}

@Override
public int channelUp() {
	if (channel+1==100)
	{
		channel=0;
		return channel;
	}
	else
		return ++channel;
	
}
public int getChannel() {
	
	return channel;
}

@Override
public int channelDown() {
	if (channel-1==-1)
	{
		channel=99;
		return channel;
	}
	else
		return --channel;
	
}
@Override
public int VolUp() {
	if(volume+1==101)
	return volume=100;
	else
	return ++volume;
}
@Override
public int VolDown() {
	if(volume-1==-1)
	return volume=0;
	else
	return --volume;
}
}
