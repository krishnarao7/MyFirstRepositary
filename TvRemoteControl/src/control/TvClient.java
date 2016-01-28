package control;

public class TvClient {

	public static void main(String[] args) {
		Tv Tele=new Tv(100,99);
		RemoteControl Rm=new RemoteControl(Tele);
		
		System.out.println("Sony...Shhhhhhhhhhh...!!!\nTv On: "+Rm.powerOnOff());
		System.out.println("Current Channel: "+Tele.getChannel());
		System.out.println("Kichhik Channel Up : "+Rm.channelUp());
		System.out.println("Kichhik Volume Increased: "+Rm.VolUp());
		System.out.println("Kichhik Channel Down: "+Rm.channelDown());
		System.out.println("Kichhik Volume Decreased: "+Rm.VolDown());
		System.out.println("Shhuuuwwweeep...!!\n Tv On: "+Rm.powerOnOff());
		System.out.println("Chhirrr");
	}

	
}
