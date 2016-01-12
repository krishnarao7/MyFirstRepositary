package buildCard2;

public class CarClient {
	public static void main(String[] args) {
		 
		 EngineBox eb=new EngineBox(100);
		 Radiator rd=new Radiator(100);
		 Chassis ch=new Chassis(100);
		 Paints pt=new Paints(100);
		 Music ms=new Music(100);
		 Seat st=new Seat(100);
		 
		 EngineSystem eSystem= new EngineSystem(eb,rd);
		 ExteriorSystem extSystem= new ExteriorSystem(pt,ch);
		 InteriorSystem intSystem= new InteriorSystem(ms,st);
		 Car myCar = new Car(eSystem,extSystem, intSystem,"HotWheels");
		 
		 System.out.println("Total Cost Of "+ myCar.name +" is " + Car.getcost(eSystem,extSystem, intSystem));
		 //+intSystem.getIntSprice()+extSystem.getExtSprice());
	}

}
