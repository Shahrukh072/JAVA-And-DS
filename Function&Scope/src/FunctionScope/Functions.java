package FunctionScope;

public class Functions {
	public static double sum (int a, int b, double c) {
		double ans= a+ b+ c;
	return ans;  //return a+b
		
	}

	public static void main(String[] args) {
		int num1= 10;
		int num2=16;
		double ans= sum(num1, num2, 10.5);
		System.out.println(ans);
	}
	
	
//	public static int sum (int a, int b) {
//		int ans= a+b;
//	return ans;  //return a+b
//		
//	}
//
//	public static void main(String[] args) {
//		int num1= 10;
//		int num2=16;
//		int ans= sum(num1, num2);
//		System.out.println(ans);
//
//	}

}
