package FunctionScope;

public class FunctionCalling {
//	public static int sum(int a, int b) {
//		int result= a+b;
//		return result;
//	}
//	public static void main(String[] args) {
//		int a=10;
//		int b=5;
//		int result = sum (a, b);
//		System.out.println(result);
//		
//
//	}
	
	public static int sum(int a, int b) {
		int result= a+b;
		return result;
	}
	public static int increment(int n) {
		n++;
		return n;
	}
	
//	public static void increment(int n) {   // pass by value
//		n++;
//		System.out.println("Increment" + n);
//	}
	public static void main(String[] args) {
		int n=10;
		n=increment(n);
		System.out.println("main" + n);
//		int a=10;
//		int b=5;
//		int result = sum (a, b);
//		System.out.println(result);
		
	}
}
