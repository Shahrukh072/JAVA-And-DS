package ClassObject;

public class Student {
   public String name;
final  private   int rollNumber;
 double cgpa;
 public  final static double CONVERSIONFACTOR = 0.95;
    private static  int numStudent;
     
    public Student(String name){
   	 this.name = name;
   	  numStudent++;
   	 this.rollNumber = numStudent;
   	    }  
    public Student() {
  	 name = "abc";                                       //static method/ static function
  	 numStudent++;
   	 this.rollNumber = numStudent;
    }
    public static int getNumStudent() {
    	return numStudent;
    }
    
   
    
// public Student(String name, int rollNumber){
//	 this.name = name;                                                     //constractor
//	 this.rollNumber = rollNumber;
//	 numStudent++;
//	 }
// public Student(String n) {                        //  constractor
//	 name =  n;
//	 rollNumber = 10;
//	// conversionFactor = 0.97;                     // without final keyword we can change the value
// }
 
 
// public Student() {
//	 name = "abc";                               // default constractor
//	 rollNumber = 10;
// }
 public void print() {
	 System.out.println(name+ " " + rollNumber) ;
 }
 
 
 
	public int getrollNumber(){
		return rollNumber;                            // get and set method
	}
//		public void setRollNumber(int num) {
//			rollNumber = num;
//			if(num<=0) {
//				return ;
//			}
//		}
	public void setRollNumber(int rollNumber) {

		if(rollNumber<=0) {
			return ;
		}
		rollNumber = rollNumber;                  //this keyword
	}
		

	}


