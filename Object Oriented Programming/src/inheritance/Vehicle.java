package inheritance;

public abstract class  Vehicle {
	 private String colour;
	 int maxSpeed;
	
	public Vehicle(int maxSpeed) {
		colour = "red";
		System.out.println(" Vechile's constructor ");
		this.maxSpeed = maxSpeed;
		
	}
	public Vehicle() {
		colour = "red";
		System.out.println(" Vehicle's constructor");
		maxSpeed = 60;
	}
	
	public String getcolour() {
		return colour;
	}
	public void setcolour(String colour) {
		this.colour = colour;
		
	}
       public void print() {
	   System.out.println("Vehicle" + " colour " + colour + " maxSpeed " +  maxSpeed);
 }
       public abstract boolean isMotorrized() ;
    	 
       public abstract String getCompany();

}
