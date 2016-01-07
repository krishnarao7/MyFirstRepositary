package buildCard2;

public class EngineSystem {
EngineBox e;
Radiator r;
int ESprice;




public EngineSystem(EngineBox e, Radiator r) {
	super();
	this.e = e;
	this.r = r;
	this.ESprice=setESprice();
}

public int setESprice() {
	return ESprice =  e.getPrice() + r.getPrice();
}

public int getESprice() {
	return ESprice;
}


}
