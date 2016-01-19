package buildCard3;

public class CarClient {
	public static void main(String[] args) {
		 
		 Parts EngineBox=new Parts(100);
		 Parts Radiator =new Parts(100);
		 Parts Chassis =new Parts(100);
		 Parts Paints=new Parts(100);
		 Parts Music =new Parts(100);
		 Parts Seat =new Parts(100);
		 
		 SubSystem EngineSystem= new SubSystem();
		 EngineSystem.addPart(EngineBox);
		 EngineSystem.addPart(Radiator);
		 SubSystem ExteriorSystem = new SubSystem();
		 
		 ExteriorSystem.addPart(Chassis);
		 ExteriorSystem.addPart(Paints);
		 SubSystem InteriorSystem = new SubSystem();
		 
		 InteriorSystem.addPart(Seat);
		 InteriorSystem.addPart(Music);
		 Car myCar = new Car("HotWheels");
		 myCar.addSSys(EngineSystem);
		 myCar.addSSys(ExteriorSystem);
		 myCar.addSSys(InteriorSystem);
		 System.out.println("Total Cost Of "+ myCar.name +" is " + Car.getcost());
		 //+intSystem.getIntSprice()+extSystem.getExtSprice());
	}

}
