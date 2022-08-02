package fundamentals;
import java.util.Scanner;

public class ConditionalRelations {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int a,b;
		a=s.nextInt();
		b=s.nextInt();
		if(a>b) {
			System.out.println("first number is greater");
			
			
		}
		else if(b>a) {
			System.out.println("Both are greater");
		}
		else {
			System.out.println("Both are equal");
		}
		
		
		
		
		
//		if(a>b) {
//			System.out.println("first number is greater");
//		}
//		else {
//			System.out.println("second number is greater");
//		}
//		else {
//			System.out.println("Both are equal");
//		}
//		
		
		
//		
//		if(a>0 && b>0) {
//			System.out.println("Both are positive");
//	}
//		else {
//			System.out.println("Both are negative");
//		}
//		
//		
		

	}

}
