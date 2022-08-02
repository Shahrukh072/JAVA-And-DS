package Arrays;

import java.util.Scanner;

public class InputOfArray1 {
	public static void printArray(int[]x) {
		int n =x.length;
		for(int i=0; i<n; i++) {
			System.out.println(x[i]);
		}
	}
	
	
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
	
	
	public static void main(String[] args) {
		int[] x = takeInput();
		printArray(x);
		
	}

}
