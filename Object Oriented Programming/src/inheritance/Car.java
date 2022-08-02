package inheritance;

public abstract class Car extends Vehicle {
	
	int numDoors;
//	int maxSpeed;
	int numGears;
	
	public Car() {
	//	super(100);
		System.out.println(" Car's constructor");
		numDoors = 4;
		numGears = 5;
		
	}
	
	public Car(int numDoors, int maxSpeed) {
		super(maxSpeed);
		System.out.println(" car's constructor ");
		this.numDoors = numDoors;
		
	}
	  public void print() {
		  super.print();
		   System.out.println("Car" + " numDoors " + numDoors);
	 }
	  public void printMaxspeed() {
		  maxSpeed = 150;
		  System.out.println(maxSpeed + " " + super.maxSpeed);
	  }

	@Override
	public boolean isMotorrized() {
		
		return true;
	}
	 

}
