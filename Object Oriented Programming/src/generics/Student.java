package generics;

public class Student implements PrintInterface {
	int rollNumber;
	
   public Student(int rollNumber) {
		
		this.rollNumber = rollNumber;
	}

@Override
public void Print() {
	System.out.println(rollNumber);
	
}

}
