package buildCard2;



public class Car {
	EngineSystem eSystem;;
	ExteriorSystem extSystem;
	InteriorSystem intSystem;
	String name;
	static int cost;
	
	
	public Car(EngineSystem eSystem, ExteriorSystem extSystem, InteriorSystem intSystem, String name) {
		this.eSystem = eSystem;
		this.extSystem = extSystem;
		this.intSystem = intSystem;
		this.name = name;
	}

	static int getcost(EngineSystem eSystem, ExteriorSystem extSystem, InteriorSystem intSystem)
	{
		return cost=eSystem.getESprice()+intSystem.getIntSprice()+extSystem.getExtSprice();
	}

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
