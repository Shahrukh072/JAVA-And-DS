package ingeritance.temp;

import inheritance.Vehicle;

public abstract class Truck extends Vehicle{
	int maxLoadingCapacity;
	 public void print() {
//		   System.out.println("Vehicle" + " colour " + getcolour() + " maxSpeed " +  maxSpeed + " maxLoadingCapacity " + maxLoadingCapacity);
	 }
	@Override
	public boolean isMotorrized() {
		// TODO Auto-generated method stub
		return false;
	}

}
