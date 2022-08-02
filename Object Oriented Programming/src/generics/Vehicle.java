package generics;

public class Vehicle implements PrintInterface{
    int maxSpeed;
    String Company;
    
    
	public Vehicle(int maxSpeed, String company) {
		super();
		this.maxSpeed = maxSpeed;
		Company = company;
	}
	public void Print() {
		System.out.println(maxSpeed + " " + Company);
	}
}	
