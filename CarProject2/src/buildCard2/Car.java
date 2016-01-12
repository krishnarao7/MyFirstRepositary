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

	}
