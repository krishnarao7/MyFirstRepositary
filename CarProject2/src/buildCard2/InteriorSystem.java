package buildCard2;

public class InteriorSystem {
Music m;
Seat s;

int IntSprice;
public int setIntSprice() {
	return IntSprice =  m.getPrice() + s.getPrice();
}

public int getIntSprice() {
	return IntSprice;
}

public InteriorSystem(Music m, Seat s) {
	
	this.m = m;
	this.s = s;
	this.IntSprice=setIntSprice();
}
}
