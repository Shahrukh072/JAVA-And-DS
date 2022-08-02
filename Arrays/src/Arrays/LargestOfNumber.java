package Arrays;

import java.util.Scanner;

public class LargestOfNumber {
	public static int [] takeInput() {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int [] x = new int [n];
		for(int i=0; i<n; i++) {
			System.out.println("Enter element at " + i + "th index");
			x[i] = s.nextInt();	
		}
		return x;
	}
	public static int largest (int x[]) {
		int max = Integer.MIN_VALUE;
		for(int i=0; i<x.length; i++) {
			if(x[i] >max) {
				max = x[i];			
		}	
		   }
		return max;
	}

	public static void main(String[] args) {
		int [] x = takeInput();
		int lar = largest(x);
		System.out.println(lar);
	}
}
