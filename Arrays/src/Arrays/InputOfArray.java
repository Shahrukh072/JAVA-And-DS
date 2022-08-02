package Arrays;

import java.util.Scanner;

public class InputOfArray {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int [] x = new int [n];
		for(int i=0; i<n; i++) {
			System.out.println("Enter element at " + i + "th index");
			x[i] = s.nextInt();	
		}
		for(int i=0; i<n; i++) {
			System.out.println(x[i]);
		}

	}

}
