package buildCard2;

public class ExteriorSystem {
Paints p;
Chassis c;
int ExtSprice;
public int setExtSprice() {
	return ExtSprice =  p.getPrice() + c.getPrice();
}

public ExteriorSystem(Paints p, Chassis c) {
	this.p = p;
	this.c = c;
	this.ExtSprice=setExtSprice();
}

public int getExtSprice() {
	return ExtSprice;
}
}
