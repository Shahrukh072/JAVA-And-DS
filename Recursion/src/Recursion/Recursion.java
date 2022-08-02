package Recursion;

public class Recursion {
	public static int fact(int n) {
		if(n==0) {
			return 1;
		}
		int smalloutput = fact(n-1);
		int output = n* smalloutput;
		return output;	
	}
	public static int sumn(int n) {
		if(n==0) {
			return 0;
		}
		int smalloutput = sumn(n-1);
		int output = n+ smalloutput;
		return output;
	}
	public static void print1ton(int n) {
		if(n==0) {
			return;
		}
		print1ton(n-1);
		System.out.println(n);
	}
	public static int fib(int n) {
		if (n==1 || n==2) {
			return 1;
		}
		int fib_n_1 = fib(n-1);
		int fib_n_2 = fib(n-2);
		int output = fib_n_1 + fib_n_2;
		return output;
	}

	public static void main(String[] args) {
//		System.out.println(fact(6));
//		System.out.println(sumn(10));
//		print1ton(5);
		System.out.println(fib(5));
		
	}

}
