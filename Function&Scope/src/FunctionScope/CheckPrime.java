package FunctionScope;

import java.util.Scanner;

public class CheckPrime {
//	public static boolean checkPrime(int n) {
//		int div= 2;
//		while(div <= n/2) {
//			if(n % div ==0) {
//				return false;
//			}
//			div = div+1;
//		}
//		return true;
//	}
//
//	public static void main(String[] args) {
//		int n;
//		Scanner s= new Scanner(System.in);
//		 n= s.nextInt();
//		boolean isprime = checkPrime(n);
//		System.out.println(isprime);
//	}

	public static boolean checkPrime(int n) {
		int div= 2;
		boolean isprime = true;
		while(div <= n/2) {
			if(n % div ==0) {
		isprime = false;
		break;
			}
			div = div+1;
		}
		if(isprime) {
			return true;	
		}else {
			return false;
		}
	}

	public static void main(String[] args) {
		int n;
		Scanner s= new Scanner(System.in);
		 n= s.nextInt();
		boolean isprime = checkPrime(n);
		System.out.println(isprime);
	}

}
